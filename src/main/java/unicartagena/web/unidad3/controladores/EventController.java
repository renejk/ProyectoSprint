package unicartagena.web.unidad3.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;
import unicartagena.web.unidad3.modelo.Event;
import unicartagena.web.unidad3.modelo.User;
import unicartagena.web.unidad3.servicio.IEventService;
import unicartagena.web.unidad3.servicio.IUserService;

@Controller
@Slf4j
public class EventController {

    @Autowired
    private IEventService eventService;

    @Autowired
    private IUserService userService;

    @GetMapping("/eventos/{id}")
    public String listarEventos(User user, Model model) {
        log.info("Entrando en el controlador eventos");
        List<Event> lista = (List<Event>) eventService.listarEventosByUserId(user);
        model.addAttribute("eventos", lista);
        return "eventos/lista";
    }

    @GetMapping("/eventos/agregar/{id}")
    public String agregar(User user, Event event) {
        log.info("Entrando en el controlador eventos" + user + "sss" + event);
        event.setId(null);
        event.setUser(user);
        return "eventos/modificar";
    }

    @PostMapping("/eventos/guardar")
    public String guardar(@Valid Event event, Errors errors) {
        if (errors.hasErrors()) {
            return "eventos/modificar";
        }
        User user = userService.obtenerUsuario(event.getUser());
        event.setUser(user);
        eventService.guardarEvento(event);

        return "redirect:/eventos/" + user.getId();
    }

    @GetMapping("/eventos/editar/{id}")
    public String editar(Event event, Model model) {
        log.info("Invocando el metodo editar");
        Event eventSearch = eventService.obtenerEvento(event);
        model.addAttribute("event", eventSearch);
        return "eventos/modificar";
    }

    @GetMapping("/eventos/eliminar/{id}")
    public String eliminar(Event event) {
        log.info("Invocando el metodo eliminar");
        eventService.eliminarEvento(event);
        final String userId = event.getUser().getId();
        return "redirect:/eventos/" + userId;
    }

}

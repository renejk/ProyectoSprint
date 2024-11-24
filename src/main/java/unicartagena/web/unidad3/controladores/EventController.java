package unicartagena.web.unidad3.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
import unicartagena.web.unidad3.modelo.Event;
import unicartagena.web.unidad3.modelo.User;
import unicartagena.web.unidad3.servicio.IEventService;

@Controller
@Slf4j
public class EventController {

    @Autowired
    private IEventService eventService;

    @GetMapping("/eventos/{id}")
    public String listarEventos(User user, Model model) {
        log.info("Entrando en el controlador eventos");
        List<Event> lista = (List<Event>) eventService.listarEventosByUserId(user);
        model.addAttribute("eventos", lista);
        return "eventos/lista";
    }

}

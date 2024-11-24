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
import unicartagena.web.unidad3.modelo.User;
import unicartagena.web.unidad3.servicio.IUserService;

@Controller
@Slf4j
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/")
    public String inicio(Model model) {
        List<User> lista = (List<User>) userService.listarUsuarios();
        model.addAttribute("users", lista);
        log.info("Entrando en el controlador inicio");
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(User user) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid User user, Errors errors) {
        if (errors.hasErrors()) {
            return "modificar";
        }
        userService.guardarUsuario(user);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(User user, Model model) {
        log.info("Invocando el metodo editar");
        User userSearch = userService.obtenerUsuario(user);
        model.addAttribute("user", userSearch);
        return "modificar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(User user) {
        log.info("Invocando el metodo eliminar");
        userService.eliminarUsuario(user);
        return "redirect:/";
    }
}

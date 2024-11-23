package unicartagena.web.unidad3;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
import unicartagena.web.unidad3.modelo.User;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.mensaje}")
    private String dato;

    @GetMapping("/")
    public String inicio(Model model) {
        String mensaje = "Saludos desde Spring MVC";
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("dato", dato);
        User user = new User();
        user.setId("1");
        user.setName("Rene");
        user.setLast_name("J");
        user.setRole("Usuario");
        user.setEmail("renejk@gmail.com");
        user.setPhone("123456789");
        user.setStatus("Activo");
        user.setPassword("123456");
        model.addAttribute("user", user);

        User user2 = new User();
        user2.setId("2");
        user2.setName("Juan");
        user2.setLast_name("P");
        user2.setRole("Administrador");
        user2.setEmail("juanp@gmail.com");
        user2.setPhone("123456789");
        user2.setStatus("Activo");
        user2.setPassword("123456");
        model.addAttribute("user2", user2);

        User user3 = new User();
        user3.setId("3");
        user3.setName("Pedro");
        user3.setLast_name("P");
        user3.setRole("Administrador");
        user3.setEmail("pedro@gmail.com");
        user3.setPhone("123456789");
        user3.setStatus("Activo");
        user3.setPassword("123456");
        model.addAttribute("user3", user3);

        List<User> lista = Arrays.asList(user2, user3);
        model.addAttribute("usuarios", lista);
        log.info("Entrando en el controlador inicio");
        return "index";
    }
}

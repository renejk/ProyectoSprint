package unicartagena.web.unidad3.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
import unicartagena.web.unidad3.dao.IUserCrud;
import unicartagena.web.unidad3.modelo.User;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    IUserCrud crud;

    @GetMapping("/")
    public String inicio(Model model) {
        List<User> lista = (List<User>) crud.findAll();
        model.addAttribute("users", lista);
        log.info("Entrando en el controlador inicio");
        return "index";
    }
}

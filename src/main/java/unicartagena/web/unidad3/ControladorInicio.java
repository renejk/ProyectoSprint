package unicartagena.web.unidad3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {


    @GetMapping("/")
    public String inicio() {
        log.info("Entrando en el controlador inicio");
        return "index";
    }
}

import org.springframework.web.bind.annotation.RequestMapping;

public class ControladorUsuarios {
    @RequestMapping("/") //Solicitud
    String hellow(){
        return "Hello World!";
    }

    @RequestMapping("/hola")
    String holam(){
        return "Hola Mundo!";
    }

    @RequestMapping("/mimedicacion") //Solicitud
    String mimedicacion(){
        return "Tómate las pastillas";
    }
}

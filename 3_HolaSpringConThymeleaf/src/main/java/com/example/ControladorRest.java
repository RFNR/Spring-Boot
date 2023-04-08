
    package com.example;

    import com.example.domain.Individuo;
    import lombok.extern.slf4j.Slf4j;
    import org.springframework.beans.factory.annotation.Value;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;

    @Controller // Ver -> inicio.txt
    @Slf4j
    public class ControladorRest {
        @Value("${nombre_empresa}")
        private String nombreEmpresa;
        @GetMapping("/")
        public String comienzo(Model model){
            String hola = "Hola mundo con Spring Boot desde " + nombreEmpresa;

            Individuo individuo = new Individuo();
            individuo.setNombre("Ronald");
            individuo.setApellido("Nogales");
            individuo.setCorreo("ronald@email.com");
            individuo.setTelefono("3516714854");
            individuo.setEdad("25 años");

            log.info("Estoy ejecutando el controlador MVC");
            model.addAttribute("variable", hola);
            model.addAttribute("individuo", individuo);
            return "indice";
        }
    }

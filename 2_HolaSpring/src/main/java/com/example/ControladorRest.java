
    package com.example;

    import lombok.extern.slf4j.Slf4j;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController @Slf4j // Ver -> inicio.txt
    public class ControladorRest {
        @GetMapping("/")
        public String comienzo(){
            log.debug("MAS INFORMACIÓN"); // Se imprime en
            log.info("Estoy ejecutando el controlador REST");
            return "Hola Mundo en Spring"; // Se imprime el String en localhost:8080
        }
    }

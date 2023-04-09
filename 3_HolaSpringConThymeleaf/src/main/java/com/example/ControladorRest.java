
    package com.example;

    import com.example.domain.Individuo;
    import lombok.extern.slf4j.Slf4j;
    import org.springframework.beans.factory.annotation.Value;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;

    import java.util.ArrayList;
    import java.util.List;

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

            Individuo individuo2 = new Individuo();
            individuo2.setNombre("Nicolas");
            individuo2.setApellido("Tagliafico");
            individuo2.setCorreo("malcom@email.com");
            individuo2.setTelefono("3517796624");
            individuo2.setEdad("39 años");

            List<Individuo> individuoList = new ArrayList<>();
            individuoList.add(individuo);
            individuoList.add(individuo2);



            log.info("Estoy ejecutando el controlador MVC");
            model.addAttribute("variable", hola);
            model.addAttribute("individuo", individuo);
            model.addAttribute("individuoList", individuoList);
            return "indice";
        }
    }

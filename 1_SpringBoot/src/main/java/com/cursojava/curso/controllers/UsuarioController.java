
    package com.cursojava.curso.controllers;

    import com.cursojava.curso.models.Usuario;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.ArrayList;
    import java.util.List;

    @RestController // -> Ver 1_Nota_RestController
    public class UsuarioController {
        @RequestMapping(value = "usuario/{id}") // -> Ver 2_Nota_RequestMapping
        public Usuario getUsuario(@PathVariable Long id){
            Usuario usuario = new Usuario();
            usuario.setId(id);
            usuario.setNombre("Ronald");
            usuario.setApellido("Nogales");
            usuario.setEmail("ronynogales15@gmail.com");
            usuario.setTelefono("3516714854");
            usuario.setPassword("40404268");
            return usuario;
        }

        @RequestMapping(value = "usuarios") // -> Ver 2_Nota_RequestMapping
        public List<Usuario> getUsuarios(){
            List<Usuario> usuarios = new ArrayList<>();

            Usuario usuario = new Usuario();
            usuario.setId(1L);
            usuario.setNombre("Ronald");
            usuario.setApellido("Nogales");
            usuario.setEmail("ronynogales15@gmail.com");
            usuario.setTelefono("3516714854");
            usuario.setPassword("40404268");
            usuarios.add(usuario);

            Usuario usuario2 = new Usuario();
            usuario2.setId(2L);
            usuario2.setNombre("Fernando");
            usuario2.setApellido("Ramirez");
            usuario2.setEmail("fernandoramirez@gmail.com");
            usuario2.setTelefono("3513472946");
            usuario2.setPassword("37655888");
            usuarios.add(usuario2);

            Usuario usuario3 = new Usuario();
            usuario3.setId(3L);
            usuario3.setNombre("Joaquin");
            usuario3.setApellido("Lara");
            usuario3.setEmail("joaquinlara@gmail.com");
            usuario3.setTelefono("3519647852");
            usuario3.setPassword("43872946");
            usuarios.add(usuario3);

            Usuario usuario4 = new Usuario();
            usuario4.setId(4L);
            usuario4.setNombre("Hector");
            usuario4.setApellido("Dominguez");
            usuario4.setEmail("hectordominguez@gmail.com");
            usuario4.setTelefono("3519422695");
            usuario4.setPassword("39786634");
            usuarios.add(usuario4);

            return usuarios;
        }

        @RequestMapping(value = "Cusuario") // -> Ver 2_Nota_RequestMapping
        public Usuario editar(){
            Usuario usuario = new Usuario();
            usuario.setNombre("Ronald");
            usuario.setApellido("Nogales");
            usuario.setEmail("ronynogales15@gmail.com");
            usuario.setTelefono("3516714854");
            usuario.setPassword("40404268");
            return usuario;
        }

        @RequestMapping(value = "Busuario") // -> Ver 2_Nota_RequestMapping
        public Usuario eliminar(){
            Usuario usuario = new Usuario();
            usuario.setNombre("Ronald");
            usuario.setApellido("Nogales");
            usuario.setEmail("ronynogales15@gmail.com");
            usuario.setTelefono("3516714854");
            usuario.setPassword("40404268");
            return usuario;
        }

        @RequestMapping(value = "Ausuario") // -> Ver 2_Nota_RequestMapping
        public Usuario buscar(){
            Usuario usuario = new Usuario();
            usuario.setNombre("Ronald");
            usuario.setApellido("Nogales");
            usuario.setEmail("ronynogales15@gmail.com");
            usuario.setTelefono("3516714854");
            usuario.setPassword("40404268");
            return usuario;
        }

    }

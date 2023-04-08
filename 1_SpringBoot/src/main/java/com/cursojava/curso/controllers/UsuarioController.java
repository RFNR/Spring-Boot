
    package com.cursojava.curso.controllers;

    import com.cursojava.curso.dao.UsuarioDao;
    import com.cursojava.curso.models.Usuario;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.ArrayList;
    import java.util.List;

    @RestController // -> Ver 1_Nota_RestController
    public class UsuarioController {
        @Autowired
        private UsuarioDao usuarioDao;
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
            return usuarioDao.getUsuarios();
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

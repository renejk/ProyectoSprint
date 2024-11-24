package unicartagena.web.unidad3.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import unicartagena.web.unidad3.dao.IUserCrud;
import unicartagena.web.unidad3.modelo.User;

public class UserServiceImp implements IUserService {

    @Autowired
    IUserCrud crud;

    @Override
    public List<User> listarUsuarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarUsuarios'");
    }

    @Override
    public void guardarUsuario(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarUsuario'");
    }

    @Override
    public User obtenerUsuario(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerUsuario'");
    }

    @Override
    public void eliminarUsuario(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarUsuario'");
    }

}

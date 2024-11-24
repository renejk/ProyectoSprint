package unicartagena.web.unidad3.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import unicartagena.web.unidad3.dao.IUserCrud;
import unicartagena.web.unidad3.modelo.User;

@Service
public class UserServiceImp implements IUserService {

    @Autowired
    IUserCrud crud;

    @Transactional(readOnly = true)
    @Override
    public List<User> listarUsuarios() {
        return (List<User>) crud.findAll();
    }

    @Transactional
    @Override
    public void guardarUsuario(User user) {
        crud.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User obtenerUsuario(User user) {
        return crud.findById(user.getId()).orElse(null);
    }

    @Transactional
    @Override
    public void eliminarUsuario(User user) {
        crud.delete(user);
    }

}

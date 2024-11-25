package unicartagena.web.unidad3.servicio;

import java.util.List;

import unicartagena.web.unidad3.modelo.User;

public interface IUserService {

    public List<User> listarUsuarios();

    public void guardarUsuario(User user);

    public User obtenerUsuario(User user);

    public void eliminarUsuario(User user);

}

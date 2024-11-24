package unicartagena.web.unidad3.servicio;

import java.util.List;

import unicartagena.web.unidad3.modelo.Event;
import unicartagena.web.unidad3.modelo.User;

public interface IEventService {

    public List<Event> listarEventosByUserId(User user);

    public void guardarEvento(Event event);

    public Event obtenerEvento(Event event);

    public void eliminarEvento(Event event);

}

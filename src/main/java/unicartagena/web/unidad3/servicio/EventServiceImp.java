package unicartagena.web.unidad3.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import unicartagena.web.unidad3.dao.IEventCrud;
import unicartagena.web.unidad3.modelo.Event;
import unicartagena.web.unidad3.modelo.User;

@Service
public class EventServiceImp implements IEventService {

    @Autowired
    IEventCrud crud;

    @Transactional(readOnly = true)
    @Override
    public List<Event> listarEventosByUserId(User user) {
        return (List<Event>) crud.findAllByUserId(user.getId());

    }

    @Transactional
    @Override
    public void guardarEvento(Event event) {
        crud.save(event);
    }

    @Transactional(readOnly = true)
    @Override
    public Event obtenerEvento(Event event) {
        return crud.findById(event.getId()).orElse(null);
    }

    @Transactional
    @Override
    public void eliminarEvento(Event event) {
        crud.delete(event);
    }

}

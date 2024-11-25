package unicartagena.web.unidad3.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import unicartagena.web.unidad3.modelo.Event;

public interface IEventCrud extends CrudRepository<Event, String> {

    @Query("from Event e where e.user.id = ?1")
    public Iterable<Event> findAllByUserId(@Param("id") String id);
}

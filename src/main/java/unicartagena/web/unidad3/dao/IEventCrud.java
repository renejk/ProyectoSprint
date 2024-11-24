package unicartagena.web.unidad3.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import unicartagena.web.unidad3.modelo.Event;

public interface IEventCrud extends CrudRepository<Event, String> {

    @Query("select e from Event e where e.id = ?1")
    public Iterable<Event> findAllByUserId(@Param("user") String id);
}

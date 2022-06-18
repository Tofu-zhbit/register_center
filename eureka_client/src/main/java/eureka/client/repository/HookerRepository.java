package eureka.client.repository;

import eureka.client.entity.Hooker;

import java.util.Collection;

public interface HookerRepository {
    Collection<Hooker> findAll();
    Hooker findById(long id);
    void saveOrUpdate(Hooker hooker);
    void deleteById(long id);
}

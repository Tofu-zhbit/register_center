package eureka.client.repository.impl;

import eureka.client.entity.Hooker;
import eureka.client.repository.HookerRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class HookerRepositoryImpl implements HookerRepository {
    private static Map<Long,Hooker> hookerMap;
    static {
        hookerMap=new HashMap<>();
        hookerMap.put(1L,new Hooker(1L,"Serlina","36D"));
        hookerMap.put(2L,new Hooker(2L,"hellsevill","32C"));
        hookerMap.put(3L,new Hooker(3L,"Megan","38E"));
    }
    @Override
    public Collection<Hooker> findAll() {
        return hookerMap.values();
    }

    @Override
    public Hooker findById(long id) {
        return hookerMap.get(id);
    }

    @Override
    public void saveOrUpdate(Hooker hooker) {
        hookerMap.put(hooker.getId(),hooker);
    }

    @Override
    public void deleteById(long id) {
        hookerMap.remove(id);
    }
}

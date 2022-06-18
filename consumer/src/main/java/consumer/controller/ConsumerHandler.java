package consumer.controller;

import consumer.entity.Hooker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Hooker> findAll(){
        return restTemplate.getForEntity
                        ("http://localhost:8010/hooker/findAll",Collection.class)
                .getBody();
    }

    @GetMapping("/findAll2")
    public Collection<Hooker> findAll2(){
        return restTemplate.getForObject
                ("http://localhost:8010/hooker/findAll",Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Hooker findById(@PathVariable("id")long id){
        return restTemplate.getForEntity
                ("http://localhost:8010/hooker/findById/{id}",
                        Hooker.class,id).getBody();
    }

    @GetMapping("/findById2/{id}")
    public Hooker findById2(@PathVariable("id")long id){
        return restTemplate.getForObject
                ("http://localhost:8010/hooker/findById/{id}",
                        Hooker.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Hooker hooker){
        restTemplate.postForEntity
                ("http://localhost:8010/hooker/save",hooker,
                        null).getBody();
    }

    @PostMapping("/save2")
    public void save2(@RequestBody Hooker hooker){
        restTemplate.postForObject
                ("http://localhost:8010/hooker/save",hooker,
                        Hooker.class);
    }

    @PutMapping("/update")
    public void update(@RequestBody Hooker hooker){
        restTemplate.put
                ("http://localhost:8010/hooker/update",hooker);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id")long id){
        restTemplate.delete
                ("http://localhost:8010/hooker/deleteById/{id}",id);
    }
}

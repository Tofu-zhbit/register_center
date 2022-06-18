package eureka.client.controller;

import eureka.client.entity.Hooker;
import eureka.client.repository.HookerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/hooker")
public class HookerHandler {
    @Autowired
    private HookerRepository hookerRepository;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Hooker> findAll(){
        return hookerRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Hooker findById(@PathVariable("id")long id){
        return hookerRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Hooker hooker){
        hookerRepository.saveOrUpdate(hooker);
    }

    @PutMapping("/update")
    public void update(@RequestBody Hooker hooker){
        hookerRepository.saveOrUpdate(hooker);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id")long id){
        hookerRepository.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口:"+this.port;
    }
}

package hystrix.feigns;


import hystrix.entity.Hooker;
import hystrix.feigns.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "service-provider",fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/hooker/findAll")
    public Collection<Hooker> findAll();

    @GetMapping("/hooker/index")
    public String index();
}

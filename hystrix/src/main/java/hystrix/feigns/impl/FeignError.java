package hystrix.feigns.impl;


import hystrix.entity.Hooker;
import hystrix.feigns.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Hooker> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "Service stopped...";
    }
}

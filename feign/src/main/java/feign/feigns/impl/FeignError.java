package feign.feigns.impl;

import feign.entity.Hooker;
import feign.feigns.FeignProviderClient;
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

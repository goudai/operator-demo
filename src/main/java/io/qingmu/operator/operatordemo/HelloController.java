package io.qingmu.operator.operatordemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.context.ShutdownEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class HelloController {

    @Autowired
    private ShutdownEndpoint shutdownEndpoint;

    @GetMapping
    public String hello() {
        return "hello !!!";
    }

    @GetMapping("/spring/shutdown")
    public Map<String, String> shutdown(){
        return shutdownEndpoint.shutdown();
    }
}

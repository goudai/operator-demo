package io.qingmu.operator.operatordemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.context.ShutdownEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class ShutdownController {
    @Autowired
    private ShutdownEndpoint shutdownEndpoint;

    @GetMapping("/spring/shutdown")
    public Map<String, String> shutdown(HttpServletRequest request) {
        return shutdownEndpoint.shutdown();
    }
}

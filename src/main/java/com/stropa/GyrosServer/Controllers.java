package com.stropa.GyrosServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping("/sync")
    public String sync() {
        System.out.println("Sync device");
        return "ok";
    }

    @PostMapping("/gyros")
    public String gyros(@RequestBody GyrosDTO gyrosDTO) {
        System.out.println(gyrosDTO);
        return "ok";
    }
}

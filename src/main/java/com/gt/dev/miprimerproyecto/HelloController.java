package com.gt.dev.miprimerproyecto;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/{name}")
    public String gretting(@PathVariable("name") String name) {
        return "Hola a todos"+name;
    }

    @PostMapping
    public ResponseEntity<String> ejemplo(@RequestBody String user) {
        var apirest = new ApiRest();

        String user1 = apirest.leerUrl("https://dog.ceo/api/breeds/image/random");
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(user);
    }


}

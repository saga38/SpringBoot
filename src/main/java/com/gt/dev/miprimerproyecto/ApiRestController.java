package com.gt.dev.miprimerproyecto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apirest")
public class ApiRestController {

    @GetMapping
    public String apirest(){
        var apirest = new ApiRest();

        return apirest.leerUrl("https://dog.ceo/api/breeds/image/random");
    }
}

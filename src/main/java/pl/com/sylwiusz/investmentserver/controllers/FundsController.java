package pl.com.sylwiusz.investmentserver.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(FundsController.RESOURCE_PATH)
public class FundsController {

    public static final String RESOURCE_PATH = "/api/internal/v0/funds";

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String listAllFunds() {
        return "{\"total\":1000000}";
    }
}

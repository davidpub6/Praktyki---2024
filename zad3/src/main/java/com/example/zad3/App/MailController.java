package com.example.zad3.App;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/email")
public class MailController {

    @PostMapping("/create")
    public ResponseEntity<String> createEmail(@RequestBody @Valid Mail email) {
        return new ResponseEntity<>("Email " + email.getEmail() + " created successfully", HttpStatus.CREATED);
    }
}

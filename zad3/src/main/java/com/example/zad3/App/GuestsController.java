package com.example.zad3.App;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/guest")
public class GuestsController {

    @PostMapping("/create")
    public ResponseEntity<String> createGuest(@RequestBody @Valid Guests guest) {
        return new ResponseEntity<>("Guest " + guest.getName() + " created successfully", HttpStatus.CREATED);
    }
}

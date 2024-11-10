package com.zad.zadanie1.myapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class MyAppController {


    //Zadanie 1

    @GetMapping("/somewhere")
    public String getSomeText() {
        return "This is some text";
    }

    //Zadanie 2

    @GetMapping("/otherplace/{name}/{age}")
    public String getMethodName(@PathVariable String name, @PathVariable int age) {
        return "Hello, "+name+". You are "+age;
    }

    //Zadanie 3

    @GetMapping("/item/{id}")
    public ItemDTO getItem(@PathVariable int id) {

        Item item = new Item(id,"Apple","Yummy apple",2.99, 15);

        ItemDTO itemDTO = new ItemDTO(item.getName(), item.getDescription(), item.getPrice());

        return itemDTO;
    } 

}

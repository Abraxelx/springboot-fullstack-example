package com.halilsahin.librarybackendservice.controller;

import com.halilsahin.librarybackendservice.entity.Library;
import com.halilsahin.librarybackendservice.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/api")
public class LibraryController {

    @Autowired
    LibraryService service;

    @GetMapping(value ="/find")
    private Library getBook(@RequestParam String title){
        return service.getBookByTitle(title);
    }

    @PostMapping(value = "/save")
    private Library saveNewBook(@RequestBody Library library){
        return service.saveNewBook(library);
    }
}

package com.halilsahin.librarybackendservice.controller;

import com.halilsahin.librarybackendservice.entity.Library;
import com.halilsahin.librarybackendservice.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/api")
public class LibraryController {

    @Autowired
    LibraryService service;

    @GetMapping(value = "/all")
    private List<Library> getAll(){
        return service.findAll();
    }

    @GetMapping(value ="/findbytitle")
    private Library getBook(@RequestParam String title){
        return service.getBookByTitle(title);
    }

    @PostMapping(value = "/save")
    private Library saveNewBook(@RequestBody Library library){
        return service.saveNewBook(library);
    }

    @PutMapping(value = "/update")
    private Library updateBook(@RequestBody Library library){
        return service.updateBook(library);
    }

    @DeleteMapping(value = "/deletebyisbn")
    private String deleteByIsbn(String isbn){
        return service.deleteBookByISBN(isbn);
    }

    @DeleteMapping(value = "/delete")
    private void delete(Library library){
        service.delete(library);
    }

}

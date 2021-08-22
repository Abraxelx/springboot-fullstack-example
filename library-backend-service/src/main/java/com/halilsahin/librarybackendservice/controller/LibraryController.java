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
    LibraryService libraryService;

    @GetMapping(value = "/all")
    private List<Library> getAll(){
        return libraryService.findAll();
    }

    @GetMapping(value ="/findbytitle")
    private Library getBook(@RequestParam String title){
        return libraryService.getBookByTitle(title);
    }

    @PostMapping(value = "/save")
    private void save(@RequestBody Library library){
         libraryService.saveOrUpdate(library);
    }

    @PutMapping(value = "/update")
    private void update(@RequestBody Library library){
        libraryService.saveOrUpdate(library);
    }


    @DeleteMapping(value = "/deletebyisbn")
    private String deleteByIsbn(String isbn){
        return libraryService.deleteBookByISBN(isbn);
    }

    @DeleteMapping(value = "/delete")
    private void delete(Library library){
        libraryService.delete(library);
    }


}

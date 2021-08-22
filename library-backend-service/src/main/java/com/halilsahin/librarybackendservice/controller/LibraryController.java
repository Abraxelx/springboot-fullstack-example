package com.halilsahin.librarybackendservice.controller;

import com.halilsahin.librarybackendservice.entity.Library;
import com.halilsahin.librarybackendservice.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/api")
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @GetMapping(value = "/all")
    private ResponseEntity<List<Library>> getAll(){
        List<Library> books = libraryService.findAll();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping(value ="/findbytitle")
    private Library getBook(@RequestParam String title){
        return libraryService.getBookByTitle(title);
    }

    @PostMapping(value = "/save")
    private ResponseEntity<Library> save(@RequestBody Library library){
        Library book = libraryService.saveOrUpdate(library);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @PutMapping(value = "/update")
    private ResponseEntity<Library> update(@RequestBody Library library){
        Library book = libraryService.saveOrUpdate(library);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }


    @DeleteMapping(value = "/deletebyisbn")
    private ResponseEntity<?> deleteByIsbn(String isbn){
        libraryService.deleteBookByISBN(isbn);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    private void delete(Library library){
        libraryService.delete(library);
    }


}

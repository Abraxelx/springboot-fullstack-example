package com.halilsahin.librarybackendservice.service;

import com.halilsahin.librarybackendservice.entity.Library;
import com.halilsahin.librarybackendservice.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    LibraryRepository repository;

    public List<Library> findAll(){
        return repository.findAll();
    }

    public Library getBookByTitle(String title){
       return repository.findByTitleContains(title);
    }

    public Library saveNewBook(Library library){
        return repository.save(library);
    }

    public Library updateBook(Library library){
        return repository.update(library);
    }

    public String deleteBookByISBN(String isbn){
        repository.deleteByISBN(isbn);
        return "Succefully Deleted";
    }

    public void delete(Library library){
        repository.delete(library);
    }

}

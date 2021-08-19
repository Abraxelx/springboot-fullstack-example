package com.halilsahin.librarybackendservice.service;

import com.halilsahin.librarybackendservice.entity.Library;
import com.halilsahin.librarybackendservice.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
    @Autowired
    LibraryRepository repository;

    public Library getBookByTitle(String title){
       return repository.findAllByTitle(title);
    }

    public Library saveNewBook(Library library){
        return repository.save(library);
    }
}

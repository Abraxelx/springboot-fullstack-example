package com.halilsahin.librarybackendservice.service;

import com.halilsahin.librarybackendservice.entity.Library;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LibraryService {
     List<Library> findAll();
     Library getBookByTitle(String title);
     String deleteBookByISBN(String isbn);
     void delete(Library library);
     void saveOrUpdate(Library library);
}

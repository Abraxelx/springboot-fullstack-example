package com.halilsahin.librarybackendservice.service.Impl;

import com.halilsahin.librarybackendservice.entity.Library;
import com.halilsahin.librarybackendservice.repository.LibraryRepository;
import com.halilsahin.librarybackendservice.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class LibraryServiceImpl implements LibraryService {

    private LibraryRepository libraryRepository;

    @Autowired
    public LibraryServiceImpl(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public List<Library> findAll(){
        return libraryRepository.findAll();
    }

    @Override
    public Library getBookByTitle(String title){
       return libraryRepository.findByTitleContains(title);
    }


    @Override
    public String deleteBookByISBN(String isbn){
        libraryRepository.deleteByISBN(isbn);
        return "Succefully Deleted";
    }

    @Override
    public void delete(Library library){
        libraryRepository.delete(library);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Library library) {
        libraryRepository.save(library);
    }

}

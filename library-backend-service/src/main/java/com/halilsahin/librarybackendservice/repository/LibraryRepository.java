package com.halilsahin.librarybackendservice.repository;

import com.halilsahin.librarybackendservice.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibraryRepository extends JpaRepository<Library, Long> {
     List<Library> findAll();
     Library findByTitleContains(String title);
     Library update(Library library);
     String deleteByISBN(String isbn);
     void delete(Library library);
}

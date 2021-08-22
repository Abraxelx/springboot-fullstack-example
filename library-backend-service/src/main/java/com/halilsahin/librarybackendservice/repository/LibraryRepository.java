package com.halilsahin.librarybackendservice.repository;

import com.halilsahin.librarybackendservice.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {

     Library findByTitleContains(String title);
     void deleteByISBN(String isbn);
}

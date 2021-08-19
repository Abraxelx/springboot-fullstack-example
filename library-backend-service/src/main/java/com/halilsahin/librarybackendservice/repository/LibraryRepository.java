package com.halilsahin.librarybackendservice.repository;

import com.halilsahin.librarybackendservice.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
     Library findAllByTitle(String title);
}

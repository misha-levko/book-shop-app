package mate.academy.bookshopapp.repository;

import mate.academy.bookshopapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> getBookById(Long id);
}

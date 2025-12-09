package mate.academy.bookshopapp.repository;

import java.util.Optional;
import mate.academy.bookshopapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> getBookById(Long id);
}

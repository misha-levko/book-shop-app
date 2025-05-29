package mate.academy.bookshopapp.service;

import java.util.List;
import mate.academy.bookshopapp.dto.BookDto;
import mate.academy.bookshopapp.dto.CreateBookRequestDto;

public interface BookService {
    BookDto createBook(CreateBookRequestDto bookDto);

    List<BookDto> getAll();

    BookDto getBookById(Long id);

    void deleteById(Long id);

    BookDto updateBookById(Long id, BookDto bookDto);
}

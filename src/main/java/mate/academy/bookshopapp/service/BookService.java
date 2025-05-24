package mate.academy.bookshopapp.service;

import mate.academy.bookshopapp.dto.BookDto;
import mate.academy.bookshopapp.dto.CreateBookRequestDto;

import java.util.List;

public interface BookService {
    BookDto createBook(CreateBookRequestDto bookDto);

    List<BookDto> getAll();

    BookDto getBookById(Long id);

    void deleteById(Long id);

    BookDto updateBookById(Long id, BookDto bookDto);
}

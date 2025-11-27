package mate.academy.bookshopapp.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.bookshopapp.dto.BookDto;
import mate.academy.bookshopapp.dto.CreateBookRequestDto;
import mate.academy.bookshopapp.exception.EntityNotFoundException;
import mate.academy.bookshopapp.mapper.BookMapper;
import mate.academy.bookshopapp.model.Book;
import mate.academy.bookshopapp.repository.BookRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookDto createBook(CreateBookRequestDto bookDto) {
        Book book = bookMapper.toModel(bookDto);
        return bookMapper.toDto(bookRepository.save(book));
    }

    @Override
    public List<BookDto> getAll() {
        return bookRepository.findAll().stream()
                .map(bookMapper::toDto)
                .toList();
    }

    @Override
    public BookDto getBookById(Long id) {
        Book book = bookRepository.getBookById(id).orElseThrow(
                () -> new EntityNotFoundException("Can't get book by id " + id)
        );
        return bookMapper.toDto(book);
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public BookDto updateBookById(Long id, CreateBookRequestDto bookRequestDto) {
        Book bookUpdate = bookRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Can't update book by id " + id)
        );
        bookUpdate.setTitle(bookRequestDto.getTitle());
        bookUpdate.setAuthor(bookRequestDto.getAuthor());
        bookUpdate.setPrice(bookRequestDto.getPrice());
        bookUpdate.setIsbn(bookRequestDto.getIsbn());
        bookUpdate.setDescription(bookRequestDto.getDescription());
        bookUpdate.setCoverImage(bookRequestDto.getCoverImage());

        return bookMapper.toDto(bookRepository.save(bookUpdate));
    }
}

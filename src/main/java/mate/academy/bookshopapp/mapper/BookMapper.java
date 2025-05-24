package mate.academy.bookshopapp.mapper;

import mate.academy.bookshopapp.config.MapperConfig;
import mate.academy.bookshopapp.dto.BookDto;
import mate.academy.bookshopapp.dto.CreateBookRequestDto;
import mate.academy.bookshopapp.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto bookDto);
}

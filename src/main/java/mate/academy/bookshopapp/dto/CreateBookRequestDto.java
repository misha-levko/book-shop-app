package mate.academy.bookshopapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class CreateBookRequestDto {
    @NotBlank
    @NotNull
    private String title;
    @NotBlank
    @NotNull
    private String author;
    @NotNull
    private String isbn;
    @NotNull
    @Positive
    private BigDecimal price;
    @NotNull
    private String description;
    @NotNull
    private String coverImage;
}

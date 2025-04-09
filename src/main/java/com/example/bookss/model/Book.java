package com.example.bookss.model;

import com.example.bookss.enumeration.Genre;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Booklar")

@NamedQueries({
        @NamedQuery(name = "Book.tapgetir", query = "select a from Book a")
})
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Azerbaycan", unique = true)
    @Size(min = 3, max = 30)
    @NotBlank(message = "Must be entered author name")





    private String author;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @NotNull
    private BigDecimal price;


    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$",message = "Must be  character at least 8 , 1 i balaca 1  i boyuk")
    private String password;




}

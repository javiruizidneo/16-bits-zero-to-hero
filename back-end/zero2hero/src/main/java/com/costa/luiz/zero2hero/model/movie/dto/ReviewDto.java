package com.costa.luiz.zero2hero.model.movie.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReviewDto {

    private Long id;
    private AuthorDto author;
    private String review;
    private boolean archived;
    private MovieDto movie;
}
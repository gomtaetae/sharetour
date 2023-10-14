package com.kosa.ShareTour.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MainItemDto {

    private Long id;

    private String title;

    private String content;

    private String imgUrl;

    private Integer totalPrice;

    @QueryProjection
    public MainItemDto(Long id, String title, String content, String imgUrl, Integer totalPrice) {

        this.id = id;
        this.title = title;
        this.content = content;
        this.imgUrl = imgUrl;
        this.totalPrice = totalPrice;
    }
}

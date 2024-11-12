package com.green.board2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@ToString
public class BoardGetOneRes {
    private int boardId;
    private String title;
    private String contents;
    private String writer;
    private String createdAt;

}

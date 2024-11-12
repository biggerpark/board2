package com.green.board2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.PathVariable;

//제목,내용,작성자 수정 가능하도록
@Getter
@Setter
@ToString
public class BoardPutReq {
    private String title;
    private String contents;
    private String writer;
}

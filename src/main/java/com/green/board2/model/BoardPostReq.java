package com.green.board2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class BoardPostReq {
    private String title;
    private String contents;
    private String writer;
}

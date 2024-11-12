package com.green.board2;

import com.green.board2.model.BoardGetOneRes;
import com.green.board2.model.BoardPostReq;
import com.green.board2.model.BoardGetRes;
import com.green.board2.model.BoardPutReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
    int postReq(BoardPostReq p);
    List<BoardGetRes> getRes();
    BoardGetOneRes getOneRes(int p);
    int putReq(BoardPutReq p);
    int putReq2(@Param("data") BoardPutReq p,int boardId);
    int deleteReq(int boardId);

}

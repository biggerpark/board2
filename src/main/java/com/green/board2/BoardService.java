package com.green.board2;

import com.green.board2.model.BoardGetOneRes;
import com.green.board2.model.BoardPostReq;
import com.green.board2.model.BoardGetRes;
import com.green.board2.model.BoardPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;


    public int postReq(BoardPostReq p){
        return mapper.postReq(p);
    }

    public List<BoardGetRes> getRes(){
        return mapper.getRes();
    }

    public BoardGetOneRes getOneRes(int p){
        return mapper.getOneRes(p);
    }
    public int putReq(BoardPutReq p){
        return mapper.putReq(p);
    }
    public int putReq2(BoardPutReq p,int boardId){
        return mapper.putReq2(p,boardId);
    }
    public int deleteReq(int boardId){
        return mapper.deleteReq(boardId);
    }

}

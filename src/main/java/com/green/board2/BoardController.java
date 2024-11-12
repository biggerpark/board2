package com.green.board2;

import com.green.board2.model.BoardGetOneRes;
import com.green.board2.model.BoardPostReq;
import com.green.board2.model.BoardGetRes;
import com.green.board2.model.BoardPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor // 생성자 자동 생성을 통해 DI를 받도록 하는 에노테이션
@RequestMapping("/board") // board 라는 url 을 통해 프론트엔드에서 데이터를 받겠다.
public class BoardController {
    private final BoardService service;

    @PostMapping // FE에서 (post)/board 요청이 오면 이 메소드가 응답을 담당하겠다 라는 것을 의미.
    public int postReq(@RequestBody BoardPostReq p){ // @RequestBody 는 옆에 나오는 매개변수 타입의 body 데이터를 프론트엔드에서 받겟다라는 의미
        System.out.println(p);
        return service.postReq(p);
    }

    @GetMapping // 데이터베이스의 모든 데이터를 return 해보자.
    public List<BoardGetRes> getRes(){
        System.out.println(service.getRes());
        return service.getRes();
    }

    @GetMapping("{boardId}")
    public BoardGetOneRes getOneRes(@PathVariable int boardId){
        System.out.println(service.getOneRes(boardId));
        return service.getOneRes(boardId);
    }

    @PutMapping
    public int putReq(@RequestBody BoardPutReq p){
        return service.putReq(p);
    }

    @PutMapping("{boardId}")
    public int putReq2(@RequestBody BoardPutReq p, @PathVariable int boardId){
        return service.putReq2(p,boardId);
    }

    @DeleteMapping("{boardId}")
    public int deleteReq(@PathVariable int boardId){
        return service.deleteReq(boardId);
    }

}

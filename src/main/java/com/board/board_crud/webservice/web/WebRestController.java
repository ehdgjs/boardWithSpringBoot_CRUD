package com.board.board_crud.webservice.web;

import com.board.board_crud.webservice.domain.posts.PostsRepository;
import com.board.board_crud.webservice.dto.posts.PostsSaveRequestDto;
import com.board.board_crud.webservice.service.PostsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    private PostsRepository postsRepository;
    private PostsService postsService;

    public WebRestController(PostsRepository postsRepository){
        this.postsRepository = postsRepository;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/posts")
    public long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
}
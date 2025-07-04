package org.example.myblog.controller;

import lombok.RequiredArgsConstructor;
import org.example.myblog.dto.PostDto;
import org.example.myblog.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/post")
@RestController
public class PostRestController {

    final PostService postService;

    @PostMapping("")
    public ResponseEntity<PostDto.CreateResDto> create(@RequestBody PostDto.CreateReqDto createReqDto) {
        return ResponseEntity.ok(postService.create(createReqDto));
    }

    @GetMapping("list")
    public ResponseEntity<List<PostDto.ListResDto>> list(PostDto.ListReqDto listReqDto) {
        return ResponseEntity.ok(postService.list(listReqDto));
    }

}

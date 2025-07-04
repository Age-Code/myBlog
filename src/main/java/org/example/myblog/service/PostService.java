package org.example.myblog.service;

import org.example.myblog.dto.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    PostDto.CreateResDto create(PostDto.CreateReqDto createReqDto);
    List<PostDto.ListResDto> list(PostDto.ListReqDto listReqDto);
}

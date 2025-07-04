package org.example.myblog.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.myblog.dto.PostDto;
import org.example.myblog.mapper.PostMapper;
import org.example.myblog.repository.PostRepository;
import org.example.myblog.service.PostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PostServiceimpl implements PostService {

    final PostRepository postRepository;
    final PostMapper postMapper;

    @Override
    public PostDto.CreateResDto create(PostDto.CreateReqDto createReqDto) {
        PostDto.CreateResDto res = postRepository.save(createReqDto.toEntity()).toCreateRespDto();

        return res;
    }

    public List<PostDto.ListResDto> list(PostDto.ListReqDto listReqDto) {
        List<PostDto.ListResDto> res = postMapper.list(listReqDto);

        return res;
    }
}

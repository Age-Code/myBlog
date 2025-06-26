package com.example.myblog.service.impl;

import com.example.myblog.dto.PostDto;
import com.example.myblog.mapper.PostMapper;
import com.example.myblog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    * 게시글 조회용 서비스 구현 클래스
 */
@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    /*
        * 게시글 조회 전용 Mapper (SQL은 SML에 정의)
     */
    private final PostMapper postMapper;

    /*
        * 게시글 상세 조회
     */
    @Override
    public PostDto.DetailResDto detail(Long id){
        return postMapper.detail(id);
    }
    
    /*
        * 게시글 목록 조회 (페이징)
     */
    @Override
    public List<PostDto.DetailResDto> pagedList(PostDto.PagedListReqDto dto){
        return postMapper.pagedList(dto);
    }
}

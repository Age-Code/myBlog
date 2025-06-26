package com.example.myblog.service.impl;

import com.example.myblog.domain.Post;
import com.example.myblog.dto.PostDto;
import com.example.myblog.mapper.PostMapper;
import com.example.myblog.repository.PostRepository;
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
    
    private final PostMapper postMapper; // 게시글 조회용 Mapper
    private final PostRepository postRepository; // 게시글 생성/수정/삭제용 repository

    /*
        * 게시글 생성
     */
    @Override
    public Long create(PostDto.CreateReqDto dto){
        Post post = Post.of(dto.getUserId(), dto.getTitle(), dto.getContent());
        return postRepository.save(post).getId();
    }

    /*
        * 게시글 수정
     */
    @Override
    public void update(Long id, PostDto.UpdateReqDto dto){
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다: id= " + id));
        post.update(dto.getTitle(), dto.getContent());
        postRepository.save(post);
    }

    /*
        * 게시글 삭제
     */
    @Override
    public void delete(Long id){
        postRepository.deleteById(id);
    }

    /*
        * 게시글 단일 상세 조회
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

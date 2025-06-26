package com.example.myblog.service;

import com.example.myblog.dto.PostDto;

import java.util.List;

/*
    * 게시글 조회 전용 서비스 인터베이스
 */
public interface PostService {

    /*
        * 게시글 생성
     */
    Long create(PostDto.CreateReqDto dto);

    /*
        * 게시글 수정
     */
    void update(Long id, PostDto.UpdateReqDto dto);

    /*
        * 게시글 삭제
     */
    void delete(Long id);

    /*
        * 게시글 단일 상세 조회
     */
    PostDto.DetailResDto detail(Long id);

    /*
        * 게시글 목록 조회 (페이징 기반)
     */
    List<PostDto.DetailResDto> pagedList(PostDto.PagedListReqDto dto);
}

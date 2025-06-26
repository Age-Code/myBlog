package com.example.myblog.service;

import com.example.myblog.dto.PostDto;

import java.util.List;

/*
    * 게시글 조회 전용 서비스 인터베이스
 */
public interface PostService {

    /*
        * 게시글 단일 상세 조회
        * @param id 게시글 ID
        * @return 상세 응답 DTO
     */
    PostDto.DetailResDto detail(Long id);

    /*
        * 게시글 목록 조회 (페이징 기반)
        * @param dto 페이지 정보 요청 DTO
        * @return 게시글 리스트
     */
    List<PostDto.DetailResDto> pagedList(PostDto.PagedListReqDto dto);
}

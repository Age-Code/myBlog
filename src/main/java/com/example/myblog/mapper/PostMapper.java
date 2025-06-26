package com.example.myblog.mapper;

import com.example.myblog.dto.PostDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
    * 게시글 조회 전용 Mapper 인터페이스
 */
public interface PostMapper {

    /*
        * 단일 게시글 상세 조회 (id로 조회)
        * @param id 게시글 ID
        * @return 게시글 상세 DTO
     */
    PostDto.DetailResDto detail(Long id);
    
    /*
        * 페이징 방식으로 게시글 목록 조회
        * @param dto 페이지 번호, 크기, 필터 조건 포함
        * @return 게시글 목록 리스트
     */
    List<PostDto.DetailResDto> pagedList(PostDto.PagedListReqDto dto);

    /*
        * 전체 게시글 수 조회 (페이징 계산용)
        * @param dto 페이지 조건
        * @return 전체 게시글 수
     */
    int pagedListCount(PostDto.PagedListReqDto dto);

    /*
        * 스크롤 방식으로 게시글 목록 조회
        * @param dto 스크롤 커서 조건
        * @return 게시글 리스트
     */
    List<PostDto.DetailResDto> scrollList(PostDto.ScrollListReqDto dto);

}

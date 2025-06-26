package com.example.myblog.dto;

import lombok.Getter;
import lombok.Setter;

public class DefaultDto {

    /*
        * 단일 상세 조회
     */
    @Getter @Setter
    public static class DetailResDto{
        Long id;
    }

    /*
        * 등록 요청
     */
    @Getter @Setter
    public static class CreateReqDto{
        Long id;
    }

    /*
        * 수정 요청
     */
    @Getter @Setter
    public static class UpdateReqDto{
        Long id;
    }

    /*
        * 리스트 조회 요청
     */
    @Getter @Setter
    public static class ListReqDto{
        Long id;
    }

    /*
        * 페이징 리스트 요청
     */
    @Getter @Setter
    public static class PagedListReqDto extends ListReqDto{
        Integer page; // 현재 페이지
        Integer size; // 페이지당 게시글 수
        Integer offset; // LIMIT OFFSET 계산용

        public void setOffset(){
            if(page != null && size != null){
                this.offset = (page - 1) * size;
            }
        }
    }

    /*
        * 스크롤 리스트 요청
     */
    @Getter @Setter
    public static class ScrollListReqDto extends ListReqDto{
        Long lastId;
        Integer size;
    }
}

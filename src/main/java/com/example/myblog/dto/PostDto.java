package com.example.myblog.dto;

import com.example.myblog.domain.Post;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

public class PostDto{

    @Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
    public static class CreateReqDto{
        Long userId;
        String title;
        String content;

        public Post toEntity(){
            return Post.of(getUserId(), getTitle(), getContent());
        }
    }

    @Getter @Setter @SuperBuilder @NoArgsConstructor @AllArgsConstructor
    public static class UpdateReqDto extends DefaultDto.UpdateReqDto{
        Long userId;
        String title;
        String content;
        Integer countRead;
    }

    @Getter @Setter @SuperBuilder @NoArgsConstructor @AllArgsConstructor
    public static class DetailResDto extends DefaultDto.DetailResDto{
        Long userId;
        String title;
        String content;
        Integer countRead;
        Integer countLike;

        List<PostimgDto.DetailResDto> imgs;

        String userUsername;
        String userName;
        String userNick;

        Boolean liked;
    }

    @Getter @Setter @SuperBuilder @NoArgsConstructor @AllArgsConstructor
    public static class ListReqDto extends DefaultDto.ListReqDto{
        Long userId;
        String title;
    }

    @Getter @Setter @SuperBuilder @NoArgsConstructor @AllArgsConstructor
    public static class PagedListReqDto extends DefaultDto.PagedListReqDto{
        Long userId;
        String title;
    }

    @Getter @Setter @SuperBuilder @NoArgsConstructor @AllArgsConstructor
    public static class ScrollListReqDto extends DefaultDto.ScrollListReqDto{
        Long userId;
        String title;
    }
}
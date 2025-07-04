package org.example.myblog.dto;

import lombok.*;
import org.example.myblog.domain.Post;

public class PostDto {

    // Create Request Dto
    @Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
    public static class CreateReqDto {

        Long id;

        Long userId;
        String title;
        String content;

        public Post toEntity() { return Post.of(getUserId(), getTitle(), getContent()); }

    }

    // Create Response Dto
    @Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
    public static class CreateResDto {

        Long id;

    }

    // List Request Dto
    @Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
    public static class ListReqDto {
        Long userId;
    }

    // List Response Dto
    @Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
    public static class ListResDto {

        Long id;
        String title;

    }
}

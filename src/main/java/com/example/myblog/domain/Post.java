package com.example.myblog.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/*
    * 기시글 도메인 Entity
 */
@Entity
@Table(name = "post")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String title;

    private String content;

    private Integer countRead;

    private Integer countLike;

    /*
        * static 팩토리 메서드
     */
    public static Post of(Long userId, String title, String content){
        return Post.builder()
                .userId(userId)
                .title(title)
                .content(content)
                .countRead(0)
                .countLike(0)
                .build();
    }

    /*
        * 게시글 수정 메서드
     */
    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}

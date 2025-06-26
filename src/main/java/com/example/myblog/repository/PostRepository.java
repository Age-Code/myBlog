package com.example.myblog.repository;

import com.example.myblog.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    * 게시글 CUD를 처리하는 Repository 인터페이스
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
}

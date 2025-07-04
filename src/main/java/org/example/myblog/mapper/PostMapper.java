package org.example.myblog.mapper;

import org.example.myblog.dto.PostDto;

import java.util.List;

public interface PostMapper {
    List<PostDto.ListResDto> list(PostDto.ListReqDto listReqDto);
}

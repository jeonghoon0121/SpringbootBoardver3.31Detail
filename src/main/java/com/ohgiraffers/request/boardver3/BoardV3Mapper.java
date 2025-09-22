package com.ohgiraffers.request.boardver3;

import com.ohgiraffers.request.post.PostDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface BoardV3Mapper {
    List<BoardV3DTO> findAllBoards();
    List<PostV3DTO> findAllPosts();
    List<CommentV3DTO> findAllComments();

    void addNewPost(PostV3DTO postV3DTO);
    void addNewComment(CommentV3DTO commentV3DTO);


    void updatePost(PostV3DTO updatePostV3DTO);

    void deletePost(PostV3DTO deletePostV3DTO);
}

package com.ohgiraffers.request.boardver3;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoardV3Service {
    private final BoardV3Mapper boardV3Mapper;
    public BoardV3Service(BoardV3Mapper boardV3Mapper){
    this.boardV3Mapper=boardV3Mapper;
}
    public List<BoardV3DTO> findAllBoards() {
        return boardV3Mapper.findAllBoards();
    }
    public List<PostV3DTO> findAllPosts(){return boardV3Mapper.findAllPosts();}
    public List<CommentV3DTO> findAllComments(){return boardV3Mapper.findAllComments();}

    @Transactional
    public void addNewPost(PostV3DTO newPostV3DTO){
        newPostV3DTO.setCreatedAt(java.time.LocalDateTime.now());
        newPostV3DTO.setViewCount(0);
        boardV3Mapper.addNewPost(newPostV3DTO);
    }
    @Transactional
    public void addNewComment(CommentV3DTO newCommentV3DTO){
        newCommentV3DTO.setCreatedAt(java.time.LocalDateTime.now());
        boardV3Mapper.addNewComment(newCommentV3DTO);
    }
    @Transactional
    public void updatePost(PostV3DTO updatePostV3DTO) {
        updatePostV3DTO.setUpdatedAt(java.time.LocalDateTime.now());
        boardV3Mapper.updatePost(updatePostV3DTO);

    }
    @Transactional
    public void deletePost(PostV3DTO deletePostV3DTO) {
        boardV3Mapper.deletePost(deletePostV3DTO);

    }
}


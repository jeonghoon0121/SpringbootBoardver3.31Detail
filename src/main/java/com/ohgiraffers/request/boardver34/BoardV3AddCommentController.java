package com.ohgiraffers.request.boardver34;

import com.ohgiraffers.request.boardver3.BoardV3Service;
import com.ohgiraffers.request.boardver3.CommentV3DTO;
import com.ohgiraffers.request.boardver3.PostV3DTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
@RequestMapping("/boardv3/add2")
public class BoardV3AddCommentController {
    private final BoardV3Service boardV3Service;
    public BoardV3AddCommentController(BoardV3Service boardV3Service){this.boardV3Service=boardV3Service;}
    @GetMapping
    public String showAddCommentForm( Model model) {
        return "boardv3/add2";
    }

}
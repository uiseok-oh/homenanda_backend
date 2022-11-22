package com.home.nanda.board.controller;

import com.home.nanda.board.model.dto.ArticleComment;
import com.home.nanda.board.service.CommentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    private CommentService commentService;

    @Autowired
    public CommentController(final CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/board/comment/{articleId}")
    private ResponseEntity<List<ArticleComment>> searchCommentsByArticleId(@PathVariable String articleId){
        final List<ArticleComment> articleComments = commentService.searchCommentsByArticleId(articleId);

        return new ResponseEntity<>(articleComments, HttpStatus.OK);
    }

}
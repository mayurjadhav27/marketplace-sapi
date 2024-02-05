package com.marketplacehub.marketplacesapi.controller;

import com.marketplacehub.marketplacesapi.data.Post;
import com.marketplacehub.marketplacesapi.service.PostService;
import com.marketplacehub.marketplacesapi.service.UserSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarketPlcaeController {

    @Autowired
    UserSerive userSerive;

    @Autowired
    PostService postService;
    @PostMapping("/savepost")
    public ResponseEntity<?> savePost(@RequestBody Post post){
        if(userSerive.isUserExist(post.getEmailId())){
            Post post1=postService.savePost(post);
            return new ResponseEntity<>(post1,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/posts")
    public ResponseEntity<?> getAllPosts(){
        List<Post> posts= postService.getAllPosts();
        return new ResponseEntity<>(posts,HttpStatus.OK);
    }

    @GetMapping("/posts/category")
    public ResponseEntity<?> getAllPostsByCategory(@RequestParam(name = "category") String category){
        List<Post> posts= postService.getPostsByCategory(category);
        return new ResponseEntity<>(posts,HttpStatus.OK);
    }

    @GetMapping("/posts/{emailId}")
    public ResponseEntity<?> getAllPostsForCurrentUser(@PathVariable("emailId") String emailId){
        List<Post> posts=  postService.getAllPostsforCurrentUser(emailId);
        return new ResponseEntity<>(posts,HttpStatus.OK);
    }

}

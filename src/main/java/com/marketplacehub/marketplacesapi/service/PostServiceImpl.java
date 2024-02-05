package com.marketplacehub.marketplacesapi.service;

import com.marketplacehub.marketplacesapi.data.Post;
import com.marketplacehub.marketplacesapi.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepo postRepo;
    @Override
    public Post savePost(Post post) {
       return postRepo.save(post);
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepo.findAll();
    }

    @Override
    public List<Post> getAllPostsforCurrentUser(String emailId) {
        return postRepo.findPostsByEmailId( emailId);
    }

    @Override
    public List<Post> getPostsByCategory(String category) {
        return postRepo.findPostsByCategory(category);
    }
}

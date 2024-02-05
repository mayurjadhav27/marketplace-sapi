package com.marketplacehub.marketplacesapi.service;

import com.marketplacehub.marketplacesapi.data.Post;

import java.util.List;

public interface PostService {

    public Post savePost(Post post);

    public List<Post> getAllPosts();

    public List<Post> getAllPostsforCurrentUser(String emailId);

    public List<Post> getPostsByCategory(String category);

}

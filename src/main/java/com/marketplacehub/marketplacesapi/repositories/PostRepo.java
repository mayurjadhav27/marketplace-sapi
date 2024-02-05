package com.marketplacehub.marketplacesapi.repositories;

import com.marketplacehub.marketplacesapi.data.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post,Integer> {
    @Query(value = "SELECT * FROM Post WHERE email_id = ?1", nativeQuery = true)
    List<Post> findPostsByEmailId(String emailId);

    @Query(value = "SELECT * FROM Post WHERE post_category = ?1", nativeQuery = true)
    List<Post> findPostsByCategory(String category);
}

package com.marketplacehub.marketplacesapi.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;

    private String emailId;
    private String headline;
    private String description;
    private String postCategory;
    private String city;

}

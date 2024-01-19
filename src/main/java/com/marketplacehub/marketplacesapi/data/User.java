package com.marketplacehub.marketplacesapi.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="User")
@Getter
@Setter
public class User {

    @Id
    @Column(name="emailid")
    private String emailId;

    private Integer mobileNumber;

    private String firstName;

    private String lastName;

}

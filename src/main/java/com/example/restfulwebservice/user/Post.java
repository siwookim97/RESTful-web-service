package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue // 자동으로 생성
    private Integer id;

    private String description;

    // User : Post -> 1 : (0~N)
    // FetchType.LAZY
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}

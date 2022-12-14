package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
// @JsonIgnoreProperties(value={"password"})
@NoArgsConstructor // 상속을 하기 위해 default 생성자 추가
//@JsonFilter("UserInfo") // filter를 통해서
//@ApiModel
@Entity // JPA
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min=2, message = "Name은 2글자 이상 입력해주세요")
    private String name;
    @Past // 과거의 데이터만 사용이 가능함
    private Date joinDate;

    // @JsonIgnore // 전달하고자 하는 JSON 값을 제어
    private String password;
    // @JsonIgnore
    private String ssn;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User(int id, String name, Date joinDate, String password, String ssn) {
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
        this.password = password;
        this.ssn = ssn;
    }
}

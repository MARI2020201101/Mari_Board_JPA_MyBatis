package com.mariworld.bootboardjpamybatis.security;

import com.mariworld.bootboardjpamybatis.entity.MemberRole;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
@Setter
@ToString
public class MemberDTO extends User {

    private String email;
    private String password;
    private String name;
    private MemberRole memberRole;

    public MemberDTO(String username
            , String password
            , String name
            , Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.email = username;
        this.password = password;
        /*고민되는 부분 - password를 받을까 말까?
        따로 이렇게 안받으면 spring security에서 null로 초기화해서 보안상 좋긴한데...
        password를 받아야 하는 상황이 올려나? 이를테면 OAuth2로 확장한다든지...*/
        this.name = name;
    }
}

package study.querydsl.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class MemberDto {

    private String username;
    private int age;

    public MemberDto() {}

    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

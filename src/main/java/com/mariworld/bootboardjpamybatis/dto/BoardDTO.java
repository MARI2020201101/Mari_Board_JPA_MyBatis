package com.mariworld.bootboardjpamybatis.dto;

import com.mariworld.bootboardjpamybatis.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    private Long bno;
    private String title;
    private String content;
    private String email;
    private String name;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}

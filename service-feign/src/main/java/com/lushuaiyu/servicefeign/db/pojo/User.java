package com.lushuaiyu.servicefeign.db.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author lushuaiyu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String user;
    private String age;
    private Integer count;
    private LocalDateTime createTime;
}

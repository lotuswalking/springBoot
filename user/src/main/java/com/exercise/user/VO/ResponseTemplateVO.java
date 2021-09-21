package com.exercise.user.VO;

import com.exercise.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    public User user;
    public Department department;

    public void setUser(User user2) {
        this.user = user2;
    }

    public void setDepartment(Department department2) {
        this.department = department2;
    }
}

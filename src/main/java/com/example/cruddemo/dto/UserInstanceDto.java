package com.example.cruddemo.dto;

import com.example.cruddemo.entity.UserEntity;

public record UserInstanceDto(
        Long id,
        String name
){
    static public UserInstanceDto ofEntity(UserEntity entity){
        return new UserInstanceDto(entity.getId(), entity.getName());
    }
}

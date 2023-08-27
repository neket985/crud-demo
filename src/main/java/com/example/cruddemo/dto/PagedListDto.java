package com.example.cruddemo.dto;

import java.util.List;

public record PagedListDto<T>(
        List<T> data,
        Integer page,
        Integer size,
        Long total
) {
}

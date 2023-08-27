package com.example.cruddemo.repository;

import com.example.cruddemo.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    @Query(value="SELECT * FROM users ORDER BY id offset ?1 limit ?2", nativeQuery = true)
    List<UserEntity> findAllPaged(Integer offset, Integer limit);

    Long countAllBy();
}

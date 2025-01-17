package com.umcreligo.umcback.domain.user.repository;

import com.umcreligo.umcback.domain.church.domain.Church;
import com.umcreligo.umcback.domain.user.domain.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findById(String id);

    @EntityGraph(attributePaths = {"church"}, type = EntityGraph.EntityGraphType.LOAD)
    User findWithJoinById(Long UserId);
}

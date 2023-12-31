package com.technews.vote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VoteRepository extends JpaRepository<Vote, Integer> {
    @Query("SELECT count(*) FROM Vote v WHERE v.postId = :id")
    int countVotesByPostId(@Param("id") Integer id);
}
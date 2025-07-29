package com.vishnu.quizapp.dao;


import com.vishnu.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer>
{

    List<Question> findByCategory(String category);


    @Query(value = "SELECT * FROM question q WHERE q.category= ?1 ORDER BY RAND() LIMIT ?2",nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}

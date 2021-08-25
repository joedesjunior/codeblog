package com.spring.codeblog.PostServiceTest;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.PostRepository;
import com.spring.codeblog.service.serviceImpl.PostServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestPostService {

    @Autowired
    private PostRepository postRepository;

    @Test
    public void TestInsertPostInDatabase() {

        Post post = new Post();
        post.setAuthor("Joedes Junior");
        post.setTitle("Iniciando com Java");
        post.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged");
        post.setDate(LocalDate.now());
        postRepository.save(post);

    }

    @Test
    public void TestSearchPostInDatabaseById() {
        Post post = new Post();
        post.setId(1L);
        postRepository.findById(post.getId());
    }
}

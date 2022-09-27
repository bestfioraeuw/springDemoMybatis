package com.lagou.springdemomybatis;

import com.lagou.mapper.ArticleMapper;
import com.lagou.mapper.CommentMapper;
import com.lagou.pojo.Article;
import com.lagou.pojo.Comment;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringDemoMybatisApplicationTests {

    @Autowired(required = false) //required  = false 允许注入的bean不存在，不存在就跳过
    private CommentMapper  commentMapper;

    @Autowired(required = false)
    private ArticleMapper articleMapper;

    @Test
    void findCommentByid() {
        Comment comment  = commentMapper.findById(1);
        System.out.println(comment);
    }
    @Test
    void findArticleById(){
        Article article  = articleMapper.selectByPrimaryKey(1);
        System.out.println(article);
    }

}

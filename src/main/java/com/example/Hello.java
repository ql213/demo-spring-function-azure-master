package com.example;

import com.example.bean.TestBean;
import com.example.model.Greeting;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;
import java.util.function.Function;

@Component
public class Hello implements Function<Mono<User>, Mono<Greeting>> {
    @Autowired
    private TestBean testBean;

    @PostConstruct
    public void init() {
        System.out.println("---------Hellobean initing");
    }

    public Mono<Greeting> apply(Mono<User> mono) {
        testBean.print();
        return mono.map(user -> new Greeting("hello, " + user.getName() + "!\n"));
    }
}

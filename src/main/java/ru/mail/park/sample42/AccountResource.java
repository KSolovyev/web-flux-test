package ru.mail.park.sample42;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class AccountResource {

    @GetMapping("accounts/{id}")
    public Mono<Account> getById(@PathVariable long id) {

    }

}

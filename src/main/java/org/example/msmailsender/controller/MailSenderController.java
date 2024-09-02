package org.example.msmailsender.controller;

import lombok.RequiredArgsConstructor;
import org.example.msmailsender.model.UserRequest;
import org.example.msmailsender.service.MailSenderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MailSenderController {
    private final MailSenderService mailSenderService;
    @PostMapping("/send")
    ResponseEntity<Void> sendMail(@RequestBody UserRequest userRequest){
        mailSenderService.sendMail(userRequest);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);    }
}

package com.assignment.Registration_backend.controller;

import com.assignment.Registration_backend.dto.LoginRequest;
import com.assignment.Registration_backend.dto.RegisterRequest;
import com.assignment.Registration_backend.service.AuthService;
import com.assignment.Registration_backend.service.AuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest) {
        authService.signup(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }
    @PostMapping("/login")
    @ResponseBody
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest) {
        System.out.println(loginRequest.getUsername());
        return authService.login(loginRequest);
    }
}

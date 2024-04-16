package com.example.spring.security.maongo.controller;

import com.example.spring.security.maongo.payload.request.LoginRequest;
import com.example.spring.security.maongo.payload.request.SignupRequest;
import com.example.spring.security.maongo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("test")
    public String test(){
        return "Test api works";
    }

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
        return authService.authenticateUser(loginRequest);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser( @RequestBody SignupRequest signUpRequest) {
        return authService.registerUser(signUpRequest);
    }
}

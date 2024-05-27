package com.sam.Online.Food.Ordering.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HomeController {

    public ResponseEntity<String> HomeController(){
        return new ResponseEntity<>("Welcome to food delivery project", HttpStatus.OK);
    }
}

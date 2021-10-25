package com.example.seminar1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
   @GetMapping("/send1")
   public String send1() {
      return "send1";
   }

   @GetMapping("/send2")
   public String send2() {
      return "send2";
   }

   @GetMapping("/send3")
   public String send3() {
      return "send3";
   }
}

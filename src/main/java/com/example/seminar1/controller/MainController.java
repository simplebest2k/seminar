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
      return "send3-1";
   }

   @GetMapping("/send4")
   public String send4() {
      return "send4";
   }

   @GetMapping("/send5")
   public String send5() {
      return "send5";
   }

   @GetMapping("/send6")
   public String send6() {
      return "send6";
   }

   @GetMapping("/send7")
   public String send7() {
      return "send7-1";
   }
}

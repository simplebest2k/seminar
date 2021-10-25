package com.example.seminar1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtcController {
   @GetMapping("/echo")
   public String echo() {
      return "echo";
   }

   @GetMapping("/echo2")
   public String echo2() {
      return "echo2";
   }

   @GetMapping("/echo21")
   public String echo21() {
      return "echo21";
   }
}

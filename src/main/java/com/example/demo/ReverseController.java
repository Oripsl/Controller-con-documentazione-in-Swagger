package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class ReverseController {
    @GetMapping("/{name}")
    public String getName(@PathVariable String name) {
        return name;
    }
    @PostMapping("/reverse")
    public String reverse(@RequestBody String name) {
        return new StringBuilder(name).reverse().toString();
    }
}

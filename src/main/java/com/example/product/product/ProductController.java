package com.example.product.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
    
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/api/product")
    public @ResponseBody List<Product> gubun(@RequestParam(defaultValue = "1") Integer gubun){
        return productRepository.findByGubun(gubun);
    }
}

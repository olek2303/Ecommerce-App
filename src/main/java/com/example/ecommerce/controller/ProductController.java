package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
public class ProductController {
    //    public String displayProducts(@RequestParam(required = false) boolean hoodie,
    //                                  @RequestParam(required = false) boolean tee, Model model) {
    @GetMapping("/products/{display}")
    public String displayProducts(@PathVariable String display, Model model) {
        if(null != display && display.equals("all")) {
            model.addAttribute("hoodie", true);
            model.addAttribute("tee", true);
        } else if (null != display && display.equals("hoodie")) {
            model.addAttribute("hoodie", true);
        } else if (null != display && display.equals("tee")) {
            model.addAttribute("tee", true);
        }
        List<Product> products = Arrays.asList(
                new Product("Zip Hoodie", "$100.00", Product.Type.HOODIE),
                new Product("Hoodie", "$90.00", Product.Type.HOODIE),
                new Product("Face Tee", "$40.00", Product.Type.TEE),
                new Product("Squirrel Hoodie", "$110.00", Product.Type.HOODIE),
                new Product("Squirrel Tee", "$55.00", Product.Type.TEE)
        );
        Product.Type[] types = Product.Type.values();
        for (Product.Type type : types) {
            model.addAttribute(type.toString(),
                    (products.stream().filter(product -> product.getType().equals(type)).collect(Collectors.toList())));
        }
        return "products.html";
    }

}

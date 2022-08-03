package com.sytoss.taco.controller;

import com.sytoss.taco.entity.*;
import lombok.extern.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    public String orderForm(Model model) {
        model.addAttribute("order", new Order());
        return "orderForm";
    }
}

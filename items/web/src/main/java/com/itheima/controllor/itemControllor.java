package com.itheima.controllor;

import com.itheima.domain.items;
import com.itheima.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class itemControllor {

    @Autowired
    private itemService itemService;

    @RequestMapping("/findById")
    public String findById(Model model, Integer id){

    items items = itemService.findById(1);
    model.addAttribute("item",items);
    return "itemDetail";

}
}

package com.burakkutbay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hasanburakkutbay on 7.02.2017.
 */
@Controller
public class MerhabaController {

    @RequestMapping("/merhaba")
    public void merhaba(Model model) {
        String mesajicerigi="Merhaba Dünya";
        model.addAttribute("mesaj", mesajicerigi);
    }
}

package com.example.ecommerce.controller;

import com.example.ecommerce.model.Contact;
import com.example.ecommerce.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// slf4j daje nam logger taki jak byl wczesniej
@Slf4j
@Controller
public class ContactController {

    //private static Logger log = LoggerFactory.getLogger(ContactController.class);
    private final ContactService contactService;

    @RequestMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }

//    @RequestMapping(value = "/saveMsg", method = RequestMethod.POST)
//    // mozna tez uzyc @PostMapping i wtedy nie pisac method = ...
//    public ModelAndView saveMessage(@RequestParam String name,
//                                    @RequestParam String mobileNum,
//                                    @RequestParam String mail,
//                                    @RequestParam String subject,
//                                    @RequestParam String message) {
//        log.info("Name: " + name);
//        log.info("Mobile Number: " + mobileNum);
//        log.info("E-mail: " + mail);
//        log.info("Subject: " + subject);
//        log.info("Message: " + message);
//        return new ModelAndView("redirect:/contact");
//    }
    // pojawia nam sie wiadomosc w logu naszego programu
    // ogolnie nie wyglada to za dobrze

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping(value = "/saveMsg", method = RequestMethod.POST)
    public ModelAndView saveMessage(Contact contact) {
        contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");
    }
}

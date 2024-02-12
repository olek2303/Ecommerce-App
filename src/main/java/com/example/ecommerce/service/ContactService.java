package com.example.ecommerce.service;

import com.example.ecommerce.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private static Logger log = LoggerFactory.getLogger(ContactService.class);
    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        // need to persist the data into the db table
        log.info(contact.toString());
        return isSaved;
    }

}

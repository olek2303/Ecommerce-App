package com.example.ecommerce.service;

import com.example.ecommerce.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


// majac tutaj request scope i counter, zeruje sie on po kazdym wywolaniu saveMsg w przegladarce
// sessionscope pamieta sesje dlatego nie tworzy nowego contact service i przez to coutner nie jest inicjalizowany
// czyli nie przyjmuje znowu 0
// jezeli z innej przegladarki otworze to bede mial nowa sesje
// applicationscope tworzy tylko jedna instancje dla calej aplikacji
@Service
@Slf4j
//@RequestScope
@SessionScope
public class ContactService {

    private int counter = 0;

    public ContactService() {
        System.out.println("Contact Service Bean initialized");
    }

    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        // need to persist the data into the db table
        log.info(contact.toString());
        return isSaved;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}

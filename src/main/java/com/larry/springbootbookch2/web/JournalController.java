package com.larry.springbootbookch2.web;


import com.larry.springbootbookch2.domain.Journal;
import com.larry.springbootbookch2.domain.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JournalController {

    @Autowired
    JournalRepository journalRepository;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("journal", journalRepository.findAll());
        return "index";
    }

    @RequestMapping(value="/journal", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    protected List<Journal> getJournal() {
        return journalRepository.findAll();
    }

}

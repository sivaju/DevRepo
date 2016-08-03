package com.iicind.data.controller;

import com.iicind.data.model.ResarvationEvent;
import com.iicind.data.service.ResarvationDao;
import com.iicind.data.repository.ResarvationRepositpry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by shivakrishna on 02/08/16.
 */

@RestController
//@RequestMapping("/resarvationEvent")
public class ResarvationController
{
    @Autowired
    ResarvationRepositpry resarvationRepositpry;
    @Autowired
    ResarvationDao dao;


//    public void bookTicket() {
//      ResarvationEvent resarvationEvent=new ResarvationEvent();
//        resarvationEvent.setTicketId(resarvationEvent.getTicketId());
//        resarvationEvent.setResarvationId(resarvationEvent.getResarvationId());
//        resarvationEvent.setPnrNumber(resarvationEvent.getPnrNumber());
//        resarvationEvent.setSourceLocation(resarvationEvent.getSourceLocation());
//        resarvationEvent.setDestinationLocation(resarvationEvent.getDestinationLocation());
//        resarvationRepositpry.save(resarvationEvent);
//    }


    @RequestMapping(value="/bookticket",method = RequestMethod.POST)

    public void add(@ModelAttribute("dao1") ResarvationEvent dao1){
        dao.add(dao1);
    }


    @RequestMapping("/getallbookinginfo")
    public Iterable<ResarvationEvent> getAllBookingInfo(){
    return resarvationRepositpry.findAll();
    }
}

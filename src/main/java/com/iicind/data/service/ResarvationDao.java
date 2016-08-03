package com.iicind.data.service;

import com.iicind.data.model.ResarvationEvent;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by shivakrishna on 03/08/16.
 */
public class ResarvationDao {
    private JdbcTemplate jdbcTemplate;

    public int add(ResarvationEvent p) {
        String sql = "insert into ResarvationEvent(ticketId,ResarvationId,pnrNumber,sourceLocation,destinationLocation values('" + p.getTicketId() + "','" + p.getResarvationId() + "','" + p.getPnrNumber() + "'+'" + p.getSourceLocation() + "','" + p.getDestinationLocation() + "')";
        return jdbcTemplate.update(sql);

    }
}

package com.example.sql_query.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DynamicQueryService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DynamicQueryService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> executeQuery(String query) {
        return jdbcTemplate.queryForList(query);
    }

    public void executeInsertQuery(String query) {
        jdbcTemplate.update(query);
    }
}

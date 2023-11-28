package com.example.sql_query.controller;

import com.example.sql_query.service.DynamicQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/query")
public class QueryController {
    @Autowired
    private DynamicQueryService dynamicQueryService;

    @GetMapping
    public List<Map<String, Object>> executeQuery(@RequestParam String query) {
        return dynamicQueryService.executeQuery(query);
    }

    @PostMapping
    public void executeInsertQuery(@RequestParam String query) {
        dynamicQueryService.executeInsertQuery(query);
    }
}

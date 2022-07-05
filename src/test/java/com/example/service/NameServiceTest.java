package com.example.service;

import org.junit.jupiter.api.Test;

class NameServiceTest {

    NameService nameService = new NameService();
    @Test
    void getName() {
        nameService.getName();
    }
}
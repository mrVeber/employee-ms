package org.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.model.Employee;
import org.example.service.EmployeeService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Validated
@RestController
@RequestMapping(path = "/admin/")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    public List<Employee> getEmployees() {
        log.info("Запрос на получение списка пользователей");
        return employeeService.getListEmployee();
}
}

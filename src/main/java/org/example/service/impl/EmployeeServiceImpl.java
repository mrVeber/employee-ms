package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.model.Employee;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

   private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getListEmployee() {
        return  employeeRepository.findAll().stream().toList();
    }
}

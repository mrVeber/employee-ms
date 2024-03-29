package org.example.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "surname")
    private String surname;
    @Column(name = "date_of_birthday")
    private LocalDateTime dateOfBirth;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "picture_URL")
    private String pictureURL;
    @Column(name = "role_id")
    private int roleID;
    @Column(name = "user_login")
    private String employeeLogin;
    @Column(name = "employee_password")
    private String employeePassword;

}



package org.example.menu;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.example.controller.EmployeeController;
import org.example.model.Employee;

import java.util.List;

@PageTitle("Main")
@Route(value = "")
public class StartedMenu extends HorizontalLayout {
    private TextField loginEmployee;
    private PasswordField passwordEmployee;
    private Button buttonLogin;
    private Button showAll;
    private EmployeeController employeeController;

    public StartedMenu() {
        loginEmployee = new TextField("Your login");
        passwordEmployee = new PasswordField("Your password");
        buttonLogin = new Button("Login");
        showAll = new Button("ShowAll");

        showAll.addClickListener(e -> {
            Notification.show(" " + employeeController.getEmployees());
        });
        buttonLogin.addClickListener(e -> {
            Notification.show("Hello " + loginEmployee.getValue());
        });
        buttonLogin.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, loginEmployee, passwordEmployee, buttonLogin);

        add(loginEmployee, passwordEmployee, buttonLogin);
    }
}

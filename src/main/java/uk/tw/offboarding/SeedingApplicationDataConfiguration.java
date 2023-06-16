package uk.tw.offboarding;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uk.tw.offboarding.domain.Employee;
import uk.tw.offboarding.domain.Grade;
import uk.tw.offboarding.domain.Office;
import uk.tw.offboarding.domain.Role;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Configuration
public class SeedingApplicationDataConfiguration {

    @Bean
    public List<Employee> getEmployees() throws Exception {
        List<Employee> employees = new ArrayList<>();
        int index = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2018-12-01");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        for (Office office: Office.values()) {
            for (Role role: Role.values()) {
                for (Grade grade: Grade.values()) {
                    Employee employee = new Employee();
                    employee.setID(++index);
                    employee.setGrade(grade);
                    employee.setName("Employee "+index);
                    employee.setOffice(office);
                    employee.setRole(role);
                    cal.add(Calendar.DAY_OF_MONTH, 1);
                    employee.setHireDate(cal.getTime());
                    employees.add(employee);
                }
            }
        }
        return employees;
    }
}

package soapapiwithspringboot.repository;

import jakarta.annotation.PostConstruct;
import localhost._8010.soap_api_with_springboot.Employee;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Innova on 02-10-2017.
 */
@Component
public class EmployeeRepository {

    private static final Map<Integer, Employee> emps = new HashMap<>();

    @PostConstruct
    public void init(){
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setFirstname("Sh");
        emp1.setLastname("Na");
        emp1.setEmail("sh@na.com");
        emp1.setJobtitle("NA");
        emps.put(emp1.getId(), emp1);
    }

    public Employee findEmployee(int id){
        return emps.get(id);
    }
}

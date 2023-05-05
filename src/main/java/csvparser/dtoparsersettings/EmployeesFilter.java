package csvparser.dtoparsersettings;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeesFilter {
public List<EmployeesDTO> filterByEmployeesDT(LocalDate birthday, double salary, String name, List<EmployeesDTO> employees) {
List<EmployeesDTO> employeesList = new ArrayList<>();
for (EmployeesDTO filter : employees) {
    if (filter.getBirthday().isAfter(birthday) && filter.getSalary() > salary && filter.getName().startsWith(name) ) {

        employeesList.add(filter);
    }

}
return employeesList;
}

}

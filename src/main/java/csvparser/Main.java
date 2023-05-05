package csvparser;

import csvparser.dtoparsersettings.EmployeesFilter;
import csvparser.stringparsersettings.EmployeesStringCsvParser;
import csvparser.stringparsersettings.EmployeesStringVariables;
import csvparser.dtoparsersettings.EmployeesDTOParser;
import csvparser.dtoparsersettings.EmployeesDTO;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        EmployeesStringCsvParser stringparser = new EmployeesStringCsvParser();
        EmployeesDTOParser DTOParser = new EmployeesDTOParser(); //DTO - Data Transfer Object

        List<EmployeesStringVariables> employeesStringVariablesList = stringparser.stringparsing("src/main/resources/employees.csv");
        List<EmployeesDTO> employeesDTOList = DTOParser.dtoParserList(employeesStringVariablesList);
        System.out.println("Filtrated by conditions:");
        EmployeesFilter filter = new EmployeesFilter();
        LocalDate data = LocalDate.of(2010, 12, 4);
        String name = "B";
        double salary = 1621;
        List<EmployeesDTO> employeeslist = filter.filterByEmployeesDT(data, salary, name, employeesDTOList);
        for (EmployeesDTO slave : employeeslist) {
            System.out.println(slave);
        }
    }
}

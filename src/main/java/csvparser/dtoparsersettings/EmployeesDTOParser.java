package csvparser.dtoparsersettings;

import csvparser.stringparsersettings.EmployeesStringVariables;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EmployeesDTOParser {
    public List<EmployeesDTO> dtoParserList(List<EmployeesStringVariables> csvLines) { //DTO - Data Transfer Object

        List<EmployeesDTO> objectoutput = new ArrayList<>();

        for (EmployeesStringVariables description : csvLines) {
            UUID uuid = UUID.fromString(description.getUuid());
            String name = description.getName();
            Double salary = Double.valueOf(description.getSalary());
            LocalDate birthday = parseDate(description.getBirthday());

            EmployeesDTO DTOparsing = new EmployeesDTO(uuid, name, salary, birthday);

            objectoutput.add(DTOparsing);
        }
        return objectoutput;
    }

    private LocalDate parseDate(String birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy h:m");
        return LocalDate.parse(birthday, formatter);
    }

}

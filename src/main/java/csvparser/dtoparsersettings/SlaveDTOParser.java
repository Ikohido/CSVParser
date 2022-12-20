package csvparser.dtoparsersettings;

import csvparser.stringparsersettings.SlaveStringVariables;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SlaveDTOParser {
    public List<SlaveDTO> dtoParserList(List<SlaveStringVariables> csvLines) { //DTO - Data Transfer Object

        List<SlaveDTO> objectoutput = new ArrayList<>();

        for (SlaveStringVariables description : csvLines) {
            UUID uuid = UUID.fromString(description.getUuid());
            String name = description.getName();
            Double salary = Double.valueOf(description.getSalary());
            LocalDate birthday = parseDate(description.getBirthday());

            SlaveDTO DTOparsing = new SlaveDTO(uuid, name, salary, birthday);

            objectoutput.add(DTOparsing);
        }
        return objectoutput;
    }

    private LocalDate parseDate(String birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy h:m");
        return LocalDate.parse(birthday, formatter);
    }

}

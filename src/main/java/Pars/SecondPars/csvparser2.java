package CommonPars.SecondPars;

import CommonPars.FirstPars.parser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class csvparser2 {
    public List<parser2> NewparserList(List<parser> scvLines) {
        List<parser2> output2 = new ArrayList<>();
        for (parser elements2 : scvLines) {
            UUID uuid = UUID.fromString(elements2.getUuid());
            String name = elements2.getName();
            double salary = Double.valueOf(elements2.getSalary());
            LocalDate birthday = parseDate(elements2.getBirthday());
            parser2 parsing2 = new parser2(uuid, name, salary, birthday);
            output2.add(parsing2);
        }
        return output2;
    }

    private LocalDate parseDate(String birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy-h-m");
        return LocalDate.parse(birthday, formatter);
    }

}

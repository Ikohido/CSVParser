package csvparser;

import csvparser.dtoparsersettings.SlavesFilter;
import csvparser.stringparsersettings.SlaveStringCsvParser;
import csvparser.stringparsersettings.SlaveStringVariables;
import csvparser.dtoparsersettings.SlaveDTOParser;
import csvparser.dtoparsersettings.SlaveDTO;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        SlaveStringCsvParser stringparser = new SlaveStringCsvParser();
        SlaveDTOParser DTOParser = new SlaveDTOParser(); //DTO - Data Transfer Object

        List<SlaveStringVariables> slaveStringVariablesList = stringparser.stringparsing("src/main/resources/slaves.csv");
        List<SlaveDTO> slavesDTOList = DTOParser.dtoParserList(slaveStringVariablesList);
        System.out.println("Filtrated by conditions:");
        SlavesFilter filter = new SlavesFilter();
        LocalDate data = LocalDate.of(2010, 12, 4);
        String name = "B";
        List<SlaveDTO> slavelist = filter.filterBySlaveDT(data, 1621, name, slavesDTOList);
        for (SlaveDTO slave : slavelist) {
            System.out.println(slave);
        }
    }
}

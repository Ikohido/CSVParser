package CsvParser;
import CsvParser.StringParserSettings.SlaveStringCsvParser;
import CsvParser.StringParserSettings.SlaveStringVariables;
import CsvParser.DTOParserSettings.SlaveDTOParser;
import CsvParser.DTOParserSettings.SlaveDTO;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        SlaveStringCsvParser stringparser = new SlaveStringCsvParser();
        SlaveDTOParser dtoParser = new SlaveDTOParser(); //DTO - Data Transfer Object

        List<SlaveStringVariables> slaveStringVariablesList = stringparser.stringparsing("src/main/resources/slaves.csv");
        List<SlaveDTO> slavesdtoList = DTOParser.dtoParserList(slaveStringVariablesList);


    }
}

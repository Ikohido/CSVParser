package CsvParser.StringParserSettings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SlaveStringCsvParser {
    public List<SlaveStringVariables> stringparsing(String pathFile) throws IOException {
        List<String> Lines = Files.readAllLines(Paths.get(pathFile));
        List<SlaveStringVariables> stringoutput = new ArrayList<>();

        for (String currentLine : Lines.subList(1, Lines.size())) {
            String[] elements = currentLine.split(";");
            SlaveStringVariables stringparser = new SlaveStringVariables
                    (elements[0], elements[1], elements[2], elements[3]);

            stringoutput.add(stringparser);
            System.out.println(stringparser);
        }

        return stringoutput;
    }
}

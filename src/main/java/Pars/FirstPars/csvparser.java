package CommonPars.FirstPars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class csvparser {
    public List<parser> parsing(String pathFile) throws IOException {
        List<String> Lines = Files.readAllLines(Paths.get(pathFile));
        List<parser> output = new ArrayList<>();

        for (String currentLine : Lines.subList(1, Lines.size())) {
            String[] elements = currentLine.split(";");
            parser parserrr = new parser
                    (elements[0], elements[1], elements[2], elements[3]);

            output.add(parserrr);
            System.out.println(parserrr);
        }

        return output;
    }
}

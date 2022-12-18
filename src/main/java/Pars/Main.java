package CommonPars;
import CommonPars.FirstPars.csvparser;
import CommonPars.FirstPars.parser;
import CommonPars.SecondPars.csvparser2;
import CommonPars.SecondPars.parser2;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        csvparser parser = new csvparser();
        csvparser2 parser2 = new csvparser2();

        List<CommonPars.FirstPars.parser> parserList = parser.parsing("src/main/resources/slaves.csv");
        List<parser2> parserList2 = parser2.NewparserList(parserList);


    }
}

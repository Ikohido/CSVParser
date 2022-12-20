package csvparser.dtoparsersettings;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class SlavesFilter {
public List<SlaveDTO> filterBySlaveDT(LocalDate birthday, double salary, String name, List<SlaveDTO> slaves) {
List<SlaveDTO> slavesList = new ArrayList<>();
for (SlaveDTO filter : slaves) {
    if (filter.getBirthday().isAfter(birthday) && filter.getSalary() > salary && filter.getName().startsWith(name) ) {

        slavesList.add(filter);
    }

}
return slavesList;
}

}

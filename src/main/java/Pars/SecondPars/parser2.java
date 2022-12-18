package CommonPars.SecondPars;

import java.time.LocalDate;
import java.util.UUID;

public class parser2 {
   private UUID uuid;
   private String name;
   private double salary;
   private LocalDate birthday;

    public parser2(UUID uuid, String name, double salary, LocalDate birthday) {
        this.uuid = uuid;
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}

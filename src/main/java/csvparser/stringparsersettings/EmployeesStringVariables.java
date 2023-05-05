package csvparser.stringparsersettings;

public class EmployeesStringVariables {
    private String uuid;
    private String name;
    private String salary;
    private String birthday;

    public EmployeesStringVariables(String uuid, String name, String salary, String birthday) {
        this.uuid = uuid;
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}




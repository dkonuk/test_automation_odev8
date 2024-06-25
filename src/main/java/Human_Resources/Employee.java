package Human_Resources;

import java.time.LocalDate;




public abstract class Employee {
    public String Name;
    public String Surname;
    public LocalDate BirthDate;
    public String Departmant;
    abstract void calculate_years_to_retire();
    abstract void add_to_department();

    public String getName() {
        return Name;
    }
    public String getSurname() {
        return Surname;
    }

}


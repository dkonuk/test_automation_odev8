package Human_Resources;


import java.time.LocalDate;
import java.time.Period;

class Male_Employee extends Employee {
    private String Gender;

    public Male_Employee(String Gender) {
        this.Gender = Gender;
    }

    @Override
    void calculate_years_to_retire() {
        LocalDate currentDate = LocalDate.now();
        System.out.println(this.Name + " " + this.Surname + " can retire in " + (65 - Period.between(this.BirthDate, currentDate).getYears()) + " years.");
    }

    @Override
    void add_to_department() {
       // Department.addEmployee(this);
        System.out.println(this.Name + " " + this.Surname + " added to " + this.Departmant + "  department.");
    }
}
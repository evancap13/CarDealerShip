
public class salesPersonsLeads {

    private String name;

    private int id;

    private double salary;


    public salesPersonsLeads() {}


    public void setName(String salespersonsName) {

        name = salespersonsName;

    }

    public void setId(int salespersonsId) {

        id = salespersonsId;

    }

    public void setSalary(double salespersonSalary) {

        salary = salespersonSalary;

    }

    public void print() {

        System.out.println("Name of Lead Sales Person: "  + name + "ID of Sales Person: " + id + "Salary of Sales Person: $ " + salary);

    }

}



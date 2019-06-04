
//Dealerships



import java.util.ArrayList;

import java.util.Scanner;


public class Dealership {





    public static void main(String[] args)

    ArrayList<Customer> Customers = new ArrayList<Customer>();

    ArrayList<SalesPersons> salesPersons = new ArrayList<SalesPersons>();

    ArrayList<salesPersonsLeads> salespersonsleads = new ArrayList<salesPersonsLeads>();

    ArrayList<Parts> parts = new ArrayList<Parts>();

    ArrayList<Vehicles> vehicles = new ArrayList<Vehicles>();

        System.out.println("Welcome! Please select an option:");

        System.out.println("1. View Vehicle Inventory");

        System.out.println("2. View Parts Inventory");

        System.out.println("3. View Sales Leads");

        System.out.println("4. View Sales Persons");

        System.out.println("5. View Customers");

        System.out.println("6. Add Vehicle");

        System.out.println("7. Remove Vehicle");

        System.out.println("8. Add Part");

        System.out.println("9. Remove Part");

        System.out.println("10. Add Customer"); //customers will be assigned to a salesman, setters and getts for salesman

        System.out.println("11. Add Sales Lead");

        System.out.println("12. Add Sales Person");

        System.out.println("Any Other #: Quit");

    int userSelection;

    boolean loopBool = true;

    Scanner scnr = new Scanner(System.in);

        while (loopBool) {

        userSelection = scnr.nextInt();

        switch(userSelection) {

            case 1:{

                for(int i = 0; i < vehicles.size(); i++) {

                    System.out.println("Vehicle name " + vehicles.get(i).getName());

                    System.out.println("Vehicle index: " +i );

                    System.out.println("Vehicle id " + vehicles.get(i).getID());

                    System.out.println("Vehicle mpg " + vehicles.get(i).getMPG());

                    System.out.println("Vehicle price $" + vehicles.get(i).getPrice());

                }



                break;}

            case 2:{

                for(int i = 0; i < parts.size(); i++) {

                    System.out.println("Part name " + parts.get(i).getName());

                    System.out.println("Vehicle Index (use to remove): "+ i);

                    System.out.println("Part id " + parts.get(i).getID());

                    System.out.println("Part price $" + parts.get(i).getPrice());

                }



                break;}



            case 3:{



                for(int i = 0; i < salesPersons.size(); i++) {

                    salespersonsleads.get(i).print();

                }

                break;}





            case 4:{



                for(int i = 0; i < salesPersons.size(); i++) {

                    salesPersons.get(i).print();

                }

                break;}





            case 5:{



                for(int i = 0; i < Customers.size(); i++) {

                    System.out.println("Customer Name: " + Customers.get(i).getName());

                    System.out.println("Customer Phone Number: " + Customers.get(i).getNumber());

                    System.out.println("Customer e-mail: " + Customers.get(i).getEmail());

                    System.out.println("Customer ID: " + Customers.get(i).getCustomerId());

                }

                break;}





            case 6:{

                Vehicles newVehicle = new Vehicles();

                System.out.println("Vehicle Name: ");

                newVehicle.setName(scnr.nextLine());

                System.out.println("Vehicle ID: ");

                newVehicle.setId(scnr.nextInt());

                System.out.println("Vehicle MPG: ");

                newVehicle.setMPG(scnr.nextInt());

                System.out.println("Vehicle Price in USD: ");

                newVehicle.setPrice(scnr.nextDouble());

                vehicles.add(newVehicle);



                break;}

            case 7:{

                System.out.println("Vehicle Index: ");

                vehicles.remove(scnr.nextInt());





                break;}

            case 8:{

                Parts newPart = new Parts();

                System.out.println("Part Name: ");

                newPart.setName(scnr.nextLine());

                System.out.println("Part ID: ");

                newPart.setId(scnr.nextInt());

                System.out.println("Part Price in USD: ");

                newPart.setPrice(scnr.nextDouble());

                parts.add(newPart);



                break;}

            case 9:{

                System.out.println("Part Index: ");

                parts.remove(scnr.nextInt());



                break;}

            case 10:{

                Customer newCustomer = new Customer();



                System.out.println("Customer Name: ");

                newCustomer.setName(scnr.nextLine());

                System.out.println("Customer Phone Number: " );

                newCustomer.setNumber(scnr.nextLine());

                System.out.println("Customer e-mail: ");

                newCustomer.setEmail(scnr.nextLine());

                System.out.println("Customer ID: ");

                newCustomer.setCustomerID(scnr.nextLine());

                Customers.add(newCustomer);

                break;}



            case 11:{

                SalesPersons newSalesPerson = new SalesPersons();



                System.out.println("Sales Person Name: ");

                newSalesPerson.setName(scnr.nextLine());

                System.out.println("Sales Person ID: " );

                newSalesPerson.setId(scnr.nextInt());

                System.out.println("Sales Person's Salary: ");

                newSalesPerson.setSalary(scnr.nextDouble());

                salesPersons.add(newSalesPerson);



                break;}



            case 12:{

                salesPersonsLeads newSalesPersonLead = new salesPersonsLeads();



                System.out.println("Sales Person Lead Name: ");

                newSalesPersonLead.setName(scnr.nextLine());

                System.out.println("Sales Person Lead ID: " );

                newSalesPersonLead.setId(scnr.nextInt());

                System.out.println("Sales Person Lead's Salary: ");

                newSalesPersonLead.setSalary(scnr.nextDouble());

                salespersonsleads.add(newSalesPersonLead);



                break;}

            default:{

                loopBool =false;

                break;}

        }





    }

}








        //end of dealership class



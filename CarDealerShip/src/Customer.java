
public class Customer {

    private String name, number, email, customerId;

    public Customer(String name, String number, String email, String customerId) {

        this.name = name;

        this.number = number;

        this.email = email;

        this.customerId = customerId;

    }



    public Customer() {}

    public String getName() {

        return name;

    }

    public String getNumber() {

        return number;

    }

    public String getEmail() {

        return email;

    }

    public String getCustomerId() {

        return customerId;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setNumber(String number) {

        this.number = number;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public void setCustomerID(String customerId) {

        this.customerId = customerId;

    }

}


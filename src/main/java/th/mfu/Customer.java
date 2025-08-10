package th.mfu;

import java.time.LocalDate;



public class Customer {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phone;
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthday;

    public Customer() {
    }

    public Customer(int id, String name, String email, String address, String phone, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.birthday = birthday;
    }

    public Customer(String name, String email, String address, LocalDate birthday) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.birthday = birthday;
    }

    public Customer(String name, String email, LocalDate birthday) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}

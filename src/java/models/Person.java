package models;

import java.io.Serializable;

public class Person implements Serializable {
    
    private String firstname;
    private String lastname;
    
     // ctrl + space 
    public Person(){
        firstname = "";
        lastname = "";
    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    // Alt + insert 

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
    
    
    
}

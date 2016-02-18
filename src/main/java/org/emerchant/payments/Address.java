package org.emerchant.payments;

public class Address  {
     
     
    private Long id; 
     
    private int houseNumber;
     
    private String streetAddress;
     
    private String city;
    
    private String state;
     
    private String zipCode;

 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public String getState() {
        return state;
    }
 
    public void setState(String state) {
        this.state = state;
    }
 
    public String getZipCode() {
        return zipCode;
    }
 
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
 
    public int getHouseNumber() {
        return houseNumber;
    }
         
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
 
    public String getStreetAddress() {
        return streetAddress;
    }
 
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
         
}

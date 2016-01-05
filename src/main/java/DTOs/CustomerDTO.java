/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
public class CustomerDTO {
    
    private int id, zip, amountOfFreeRides;
    private String firstName, lastName, type, street, floor, door, country, 
            username, password;

    public CustomerDTO(int id, int zip, int amountOfFreeRides, String firstName, 
            String lastName, String type, String street, String floor, 
            String door, String country, String username, String password) {
        this.id = id;
        this.zip = zip;
        this.amountOfFreeRides = amountOfFreeRides;
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.street = street;
        this.floor = floor;
        this.door = door;
        this.country = country;
        this.username = username;
        this.password = password;
    }

    public CustomerDTO(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getAmountOfFreeRides() {
        return amountOfFreeRides;
    }

    public void setAmountOfFreeRides(int amountOfFreeRides) {
        this.amountOfFreeRides = amountOfFreeRides;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}

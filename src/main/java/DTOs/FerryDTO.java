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
public class FerryDTO {
    
    private int id, maxPeople, maxCar, maxLorry, maxMachinery, ownerId;
    private boolean movableDeck, outOfService;
    private String note;

    public FerryDTO(int id, int maxPeople, int maxCar, int maxLorry, int maxMachinery, boolean movableDeck, boolean outOfService, String note, int owner) {
        this.id = id;
        this.maxPeople = maxPeople;
        this.maxCar = maxCar;
        this.maxLorry = maxLorry;
        this.maxMachinery = maxMachinery;
        this.movableDeck = movableDeck;
        this.outOfService = outOfService;
        this.note = note;
        this.ownerId = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getMaxCar() {
        return maxCar;
    }

    public void setMaxCar(int maxCar) {
        this.maxCar = maxCar;
    }

    public int getMaxLorry() {
        return maxLorry;
    }

    public void setMaxLorry(int maxLorry) {
        this.maxLorry = maxLorry;
    }

    public int getMaxMachinery() {
        return maxMachinery;
    }

    public void setMaxMachinery(int maxMachinery) {
        this.maxMachinery = maxMachinery;
    }

    public boolean isMovableDeck() {
        return movableDeck;
    }

    public void setMovableDeck(boolean movableDeck) {
        this.movableDeck = movableDeck;
    }

    public boolean isOutOfService() {
        return outOfService;
    }

    public void setOutOfService(boolean outOfService) {
        this.outOfService = outOfService;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getOwner() {
        return ownerId;
    }

    public void setOwner(int owner) {
        this.ownerId = owner;
    }
    
}

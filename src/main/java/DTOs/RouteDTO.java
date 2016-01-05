/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import java.io.Serializable;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
public class RouteDTO implements Serializable{
    
    private int id;
    private HarborDTO departureHarbor, arrivalHarbor;
    private double price;
    private FerryDTO ferry;
    private RestrictionDTO restriction;
    private ScheduleDTO schedule;

    public RouteDTO(int id, HarborDTO departureHarbor, HarborDTO arrivalHarbor, double price, FerryDTO ferry, RestrictionDTO restriction, ScheduleDTO schedule) {
        this.id = id;
        this.departureHarbor = departureHarbor;
        this.arrivalHarbor = arrivalHarbor;
        this.price = price;
        this.ferry = ferry;
        this.restriction = restriction;
        this.schedule = schedule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HarborDTO getDepartureHarbor() {
        return departureHarbor;
    }

    public void setDepartureHarbor(HarborDTO departureHarbor) {
        this.departureHarbor = departureHarbor;
    }

    public HarborDTO getArrivalHarbor() {
        return arrivalHarbor;
    }

    public void setArrivalHarbor(HarborDTO arrivalHarbor) {
        this.arrivalHarbor = arrivalHarbor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public FerryDTO getFerry() {
        return ferry;
    }

    public void setFerry(FerryDTO ferry) {
        this.ferry = ferry;
    }

    public RestrictionDTO getRestriction() {
        return restriction;
    }

    public void setRestriction(RestrictionDTO restriction) {
        this.restriction = restriction;
    }

    public ScheduleDTO getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleDTO schedule) {
        this.schedule = schedule;
    }
    
}

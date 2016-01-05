/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
public class OrderDTO implements Serializable {
    
    private int id, customerId, routeId, nrOfPassangers;
    private ScheduleDTO schedule;
    private Collection<VehicleDTO> vehicles;
    private Collection<DiscountDTO> discounts;

    public OrderDTO(int id, int customerId, int routeId, int nrOfPassangers, ScheduleDTO schedule, Collection<VehicleDTO> vehicles, Collection<DiscountDTO> discounts) {
        this.id = id;
        this.customerId = customerId;
        this.routeId = routeId;
        this.nrOfPassangers = nrOfPassangers;
        this.schedule = schedule;
        this.vehicles = vehicles;
        this.discounts = discounts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public int getNrOfPassangers() {
        return nrOfPassangers;
    }

    public void setNrOfPassangers(int nrOfPassangers) {
        this.nrOfPassangers = nrOfPassangers;
    }

    public ScheduleDTO getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleDTO schedule) {
        this.schedule = schedule;
    }

    public Collection<VehicleDTO> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Collection<VehicleDTO> vehicles) {
        this.vehicles = vehicles;
    }

    public Collection<DiscountDTO> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Collection<DiscountDTO> discounts) {
        this.discounts = discounts;
    }

   
}

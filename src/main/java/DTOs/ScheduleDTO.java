/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import java.sql.Timestamp;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
public class ScheduleDTO {
    
    private int id;
    private Timestamp departureTime;
    private Timestamp arrivalTime;

    public ScheduleDTO(int id, Timestamp departureTime, Timestamp arrivalTime) {
        this.id = id;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contracts;

import DTOs.DiscountDTO;
import DTOs.FerryDTO;
import DTOs.HarborDTO;
import DTOs.RouteDTO;
import DTOs.ScheduleDTO;
import DTOs.VehicleDTO;
import ETOs.NoTransactionETO;
import ETOs.NoDiscountETO;
import ETOs.NoFerryETO;
import ETOs.NoHarborETO;
import ETOs.NoRouteETO;
import ETOs.NoScheduleETO;
import ETOs.NoVehicleETO;
import java.util.Collection;
import javax.ejb.Remote;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
@Remote
public interface AdminContract extends CustomerContract{
     
    //Admin methods
       
     /**
     * This will return all the data about the ferries in the system
     * @pre the administrator is logged in
     * @throws NoFerryETO if the data can't be fetched
     * @post the front end has all objects of ferries
     * @return the Collection of ferries 
     */
    public Collection<FerryDTO> getAllFerries() throws NoFerryETO;
    
    /**
     * Creates a new ferry in the system
     * @pre the administrator is logged in
     * @param ferry all the information about the new ferry
     * @throws NoTransactionETO the booking could not be created
     * @post new ferry is created
     * @return true or false if the ferry was created in the db 
     */
    public boolean createFerry(FerryDTO ferry) throws NoTransactionETO;
    
    /**
     * Edits a ferry from the system
     * @pre the id of the ferry should be existent in the database
     * @param editedFerry all the information about the new new ferry
     * @param ferryId id of the ferry to be edited
     * @throws NoFerryETO the booking could not be created
     * @post
     * @return true or false if the ferry was edited in the db
     */
    public boolean editFerry(FerryDTO editedFerry, int ferryId) throws NoFerryETO;
    
    /**
     * Creates a new route in the system. This means selecting a departure harbor,
     * arrival harbor, price for the journey, ferry, schedule and notes
     * @pre the administrator is logged in
     * @param route all the information about the new route
     * @throws NoTransactionETO the route could not be created
     * @post new route has been created
     * @return true or false if the route was created in the db
     */
    public boolean createRoute(RouteDTO route) throws NoTransactionETO;

    /**
     * This will return all the data about the different routes in the system
     * This will include harbors, schedules, ferries, prices and restrictions
     * @pre the administrator is logged in
     * @throws NoRouteETO the route could not be created
     * @post the front end has all objects of ferries
     * @return the Collection of all the routes
     */
    public Collection<RouteDTO> getAllRoutes() throws NoRouteETO;
    
    /**
     * Fetches all existing harbors
     * @pre the administrator is logged in
     * @throws NoHarborETO the route could not be created
     * @post the front end has all objects of harbors
     * @return the Collection of all the harbors 
     */    
    public Collection<HarborDTO> getAllHarbors() throws NoHarborETO;
    
    /**
     * Fetches all existing types of vehicles
     * @pre the administrator is logged in
     * @throws NoVehicleETO the route could not be created
     * @post the front end has all objects of vehicles
     * @return the Collection of all the vehicles 
     */ 
    public Collection<VehicleDTO> getAllVehicles() throws NoVehicleETO;
    
    /**
     * Fetches all existing schedules
     * @pre the administrator is logged in
     * @throws NoScheduleETO the route could not be created
     * @post the front end has all objects of schedules
     * @return the Collection of all the schedules 
     */
    public ScheduleDTO getSchedule(int scheduleId) throws NoScheduleETO;
    
    /**
     * Fetches all existing discounts
     * @pre the administrator is logged in
     * @throws NoDiscountETO the route could not be created
     * @post the front end has all objects of discounts
     * @return the Collection of all the discounts 
     */
    public Collection<DiscountDTO> getAllDiscounts() throws NoDiscountETO; 
 
    public boolean createHarbor(HarborDTO harbor) throws NoTransactionETO;
    
    public boolean createSchedule(ScheduleDTO schedule) throws NoTransactionETO;
    
}

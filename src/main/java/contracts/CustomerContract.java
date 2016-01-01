/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contracts;

import DTOs.BookingDTO;
import DTOs.RouteDTO;
import java.util.Collection;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
public interface CustomerContract {
    
    
        /**
     * Books a ticket for one or more people and their vehicle
     * @pre
     *  @param booking all the needed information to book a ticket/tickets for a user
     * @throws DataNoTransactionDTO the booking could not be created
     * @post
     *  @return the result if the booking was successfully made or not
     */
    public boolean book(BookingDTO booking);
    /**
     * This will return all the data about the different routes in the system
     * This will include harbors and timetables
     * @pre 
     *  @throws DataNoFetchETO if the data can't be fetched
     * @post return all information about the different routes
     *  @return the Collection with all the routes in the system 
     */
    public Collection<RouteDTO> getRouteList();
}

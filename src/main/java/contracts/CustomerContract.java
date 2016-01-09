/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contracts;

import DTOs.AllAboutCustomerDTO;
import DTOs.AllForBookingDTO;
import DTOs.BookingDTO;
import DTOs.CustomerDTO;
import DTOs.OrderDTO;
import ETOs.NoTransactionETO;
import ETOs.NoConnectionETO;
import ETOs.NoCustomerETO;
import java.util.Collection;
import javax.ejb.Remote;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
@Remote
public interface CustomerContract{
    
    /**
     * Gets every information for the customer front end to create a booking
     * @pre there is a connection to the backend
     * @throws NoConnectionETO the booking could not be created
     * @post all the information about routes, timetables, harbors, availability 
     * for vehicles on board are sent to the front end
     * @return the object containing all information
     */
     public AllForBookingDTO getAllForBooking() throws NoConnectionETO;
    
    /**
     * Books a ticket for one or more people and their vehicle
     * @pre
     * @param booking all the needed information to book a ticket/tickets for a user
     * @throws NoTransactionETO the booking could not be created
     * @post
     * @return the result if the booking was successfully made or not
     */
    public boolean book(BookingDTO booking) throws NoTransactionETO;
   
    public CustomerDTO createCustomer(CustomerDTO customer);
    
    public boolean editCustomer(CustomerDTO editedCustomer, int customerId) throws NoCustomerETO;
    
    /**
     * Shows all the information about the customer
     * @pre the customer is logged in
     * @param email the unique email address of the user
     * @throws NoCustomerETO there is no such account
     * @post all the information, including the purchase history is available to the front end
     * @return the object containing all the information
     */
    public AllAboutCustomerDTO getAllAboutCustomer(String email) throws NoCustomerETO;
    
    public Collection<OrderDTO> getCustomerHistory(int customerId);
    
    public void editBooking(BookingDTO editedBooking, int bookingId) throws NoTransactionETO;
    
}

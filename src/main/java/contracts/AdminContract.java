/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contracts;

import DTOs.FerryDTO;
import DTOs.RouteDTO;
import java.util.Collection;
import javax.ejb.Remote;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
@Remote
public interface AdminContract {
    
  
    /**
     * This will return all the data about the different routes in the system
     * This will include harbors and timetables
     * @pre 
     *  @throws DataNoFetchETO if the data can't be fetched
     * @post return all information about the different routes
     *  @return the Collection with all the routes in the system 
     */
    public Collection<RouteDTO> getAllRoutes();
   
     /**
     * This will return all the data about the ferries in the system
     * @pre 
     *  @throws DataNoFetchETO if the data can't be fetched
     * @post return all information about the ferries
     *  @return the Collection of ferries 
     */
    public Collection<FerryDTO> getAllFerries();
    
    /**
     * Creates a new ferry in the system
     * @pre
     *  @param contains all the information about the new new ferry
     * @throws DataNoTransactionDTO the booking could not be created
     * @post
     *  @return the result if the ferry was actually created in the db or not
     */
    public boolean createFerry(FerryDTO ferry);
    /**
     * Edits a ferry from the system
     * @pre the id of the ferry should be existent in the database
     *  @param contains all the information about the new new ferry
     * @throws DataNoTransactionDTO the booking could not be created
     * @post
     *  @return the result if the ferry was actually created in the db or not
     */
    public FerryDTO editFerry(FerryDTO editedFerry, int ferryId);
    
}

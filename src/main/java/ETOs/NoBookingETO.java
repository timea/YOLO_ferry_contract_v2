/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ETOs;

/**
 *
 * @author Timea Kiss <cph-tk10@cphbusiness.dk>
 */
public class NoBookingETO extends Exception {
    
    public NoBookingETO(String message) {
        super(message);
    }
    
}
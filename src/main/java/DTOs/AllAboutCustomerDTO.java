/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import java.util.Collection;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
public class AllAboutCustomerDTO {
    
    private String firstName, lastName, type, street, zip, floor, door, country;
    private int id, amountOfFreeRides;
    private Collection CustomerHistoryNotes;
    private Collection Orders;
    private AccountDTO account;
    
}

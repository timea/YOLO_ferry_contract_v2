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
public class BookingDTO implements Serializable {
    
    private CustomerDTO customer;
    private RouteDTO route;
    private Collection<DiscountDTO> discounts;

    public BookingDTO(CustomerDTO customer, RouteDTO route, Collection<DiscountDTO> discounts) {
        this.customer = customer;
        this.route = route;
        this.discounts = discounts;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public RouteDTO getRoute() {
        return route;
    }

    public void setRoute(RouteDTO route) {
        this.route = route;
    }

    public Collection<DiscountDTO> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Collection<DiscountDTO> discounts) {
        this.discounts = discounts;
    }
    
}

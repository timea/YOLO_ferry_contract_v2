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
public class AllForBookingDTO implements Serializable {
    
    private Collection<RouteDTO> routes;
    private Collection<DiscountDTO> discounts;

    public AllForBookingDTO(Collection<RouteDTO> routes, Collection<DiscountDTO> discounts) {
        this.routes = routes;
        this.discounts = discounts;
    }

    public Collection<RouteDTO> getRoutes() {
        return routes;
    }

    public void setRoutes(Collection<RouteDTO> routes) {
        this.routes = routes;
    }

    public Collection<DiscountDTO> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Collection<DiscountDTO> discounts) {
        this.discounts = discounts;
    }
    
}

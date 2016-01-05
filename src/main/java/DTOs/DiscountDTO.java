/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
public class DiscountDTO {
    
    private int id;
    private String name;
    private int percent;

    public DiscountDTO(int id, String name, int percent) {
        this.id = id;
        this.name = name;
        this.percent = percent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bvsystem.common;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author George Mahlangu
 */
@Getter
@Setter
public class HomeOwnerDTO {
    
    private long id;
    private String firstname;
    private String lastname;
    private String houseNumber;
    private String mobileNumber;
    private AddressDTO address;
    private String designation;
    
    
}

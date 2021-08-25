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
public class AddressDTO {
    private long id;
    private String line1;
    private String line2;
    private String suburb;
    private String code;
    private String addressType;
    
}

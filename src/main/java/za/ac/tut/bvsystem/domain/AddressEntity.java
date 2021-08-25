/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bvsystem.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author George Mahlangu
 */
@Entity
@Table(name = "address")
@Setter
@Getter
public class AddressEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "line1")
    private String line1;
    
    @Column(name = "line2")
    private String line2;
    
    @Column(name = "suburb")
    private String suburb;
    
    @Column(name = "code")
    private String code;
    
    @Column(name = "addressType")
    private String addressType;

    public AddressEntity() {
    }

    public AddressEntity(String line1, String line2, String suburb, String code, String addressType) {
        this.line1 = line1;
        this.line2 = line2;
        this.suburb = suburb;
        this.code = code;
        this.addressType = addressType;
    }
    
     
}

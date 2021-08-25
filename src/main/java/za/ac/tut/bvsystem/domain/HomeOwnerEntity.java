/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bvsystem.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author George Mahlangu
 */
@Entity
@Table(name = "home_owner")
@Getter
@Setter
public class HomeOwnerEntity implements Serializable{
    
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "firstname")
    private String firstname;
    
    @Column(name = "lastname")
    private String lastname;
    
    @Column(name = "houseNumber")
    private String houseNumber;
    
    @Column(name = "mobileNumber")
    private String mobileNumber;
    
    @OneToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    private AddressEntity address;
    
    @Column(name = "designation")
    private String designation;

    public HomeOwnerEntity() {
    }

    public HomeOwnerEntity(String firstname, String lastname, String houseNumber, String mobileNumber, AddressEntity address, String designation) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.houseNumber = houseNumber;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.designation = designation;
    }
    
    
   
    
    
}

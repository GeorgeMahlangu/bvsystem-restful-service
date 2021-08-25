/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bvsystem.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.tut.bvsystem.common.AddressDTO;
import za.ac.tut.bvsystem.common.HomeOwnerDTO;
import za.ac.tut.bvsystem.domain.HomeOwnerEntity;
import za.ac.tut.bvsystem.persistance.HomeOwnerRepository;

/**
 *
 * @author George Mahlangu
 */
@RestController
public class HomeOwnerServiceController {
    
    @Autowired
    private HomeOwnerRepository  homeOwnerRepository;
    
    
    @RequestMapping(value = "/homeOwner/{houseNumber}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<HomeOwnerDTO> getHomeOwnerByHouseNumber(@PathVariable("houseNumber") String houseNumber)
    {
        HomeOwnerEntity home = homeOwnerRepository.findByHouseNumber(houseNumber);
        HomeOwnerDTO homeOwnerDTO = new HomeOwnerDTO();
        homeOwnerDTO.setId(home.getId());
        homeOwnerDTO.setFirstname(home.getFirstname());
        homeOwnerDTO.setLastname(home.getLastname());
        homeOwnerDTO.setMobileNumber(home.getMobileNumber());
        homeOwnerDTO.setDesignation(home.getDesignation());
        homeOwnerDTO.setHouseNumber(home.getHouseNumber());
        
        //Address
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(home.getAddress().getId());
        addressDTO.setLine1(home.getAddress().getLine1());
        addressDTO.setLine2(home.getAddress().getLine2());
        addressDTO.setSuburb(home.getAddress().getSuburb());
        addressDTO.setCode(home.getAddress().getCode());
        addressDTO.setAddressType(home.getAddress().getAddressType());
        homeOwnerDTO.setAddress(addressDTO);
         
        
        return new ResponseEntity<>(homeOwnerDTO, HttpStatus.OK);
    }
    
    
    //Get All Home Owners
    @RequestMapping(value = "/homeOwners", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public List<HomeOwnerEntity> getHomeOwners()
    {
        return homeOwnerRepository.findAll();
    }
    
    //POST Create home owner 
    @RequestMapping(value = "/homeOwner/{houseNumber}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity<Object> createHomeOwner(@RequestBody HomeOwnerEntity homeOwnerEntity)
    {
        homeOwnerRepository.save(homeOwnerEntity);
        
        return new ResponseEntity<>("Home Owner Successfully created", HttpStatus.CREATED);
    }
    
    //Update Home Owner
    @RequestMapping(value = "/homeOwner/{houseNumber}",produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
    public ResponseEntity<Object> updateHomeOwner(@PathVariable String HouseNumber, @RequestBody HomeOwnerEntity homeOwnerEntity)
    {
        homeOwnerRepository.save(homeOwnerEntity);
        
        return new ResponseEntity<>("Home owner successfully updated", HttpStatus.OK);
    }
    
    //Delete Home Owner
    @RequestMapping(value = "/homeOwner/{houseNumber}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteHomeOwner(@PathVariable String houseNumber)
    {
       HomeOwnerEntity homeOwnerEntity = homeOwnerRepository.findByHouseNumber(houseNumber);
       homeOwnerRepository.delete(homeOwnerEntity);
       
       return new ResponseEntity<>("Home owner successfully deleted", HttpStatus.CREATED);
    }
    
        
 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bvsystem.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.tut.bvsystem.domain.HomeOwnerEntity;

/**
 *
 * @author George Mahlangu
 */
@Repository
public interface HomeOwnerRepository extends JpaRepository<HomeOwnerEntity, Long>
{
    HomeOwnerEntity findByHouseNumber(String houseNumber);
    
}

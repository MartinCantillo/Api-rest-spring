/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Software2.Package.Repository;

import com.Software2.Package.Model.Ciudadano;
import com.Software2.Package.Model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadanoRepository extends CrudRepository<Ciudadano, Long> {

    Optional<Ciudadano> findByUser(User user);

}

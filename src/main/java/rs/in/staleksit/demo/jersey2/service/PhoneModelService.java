/**
 * 
 */
package rs.in.staleksit.demo.jersey2.service;

import java.util.List;

import rs.in.staleksit.demo.jersey2.dto.PhoneModelDTO;

/**
 *
 */
public interface PhoneModelService {
	
	PhoneModelDTO findOne(Integer id);
	
	List<PhoneModelDTO> findAll();


}

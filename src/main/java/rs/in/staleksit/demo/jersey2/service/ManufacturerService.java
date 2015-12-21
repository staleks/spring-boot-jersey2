/**
 * 
 */
package rs.in.staleksit.demo.jersey2.service;

import java.util.List;

import rs.in.staleksit.demo.jersey2.dto.ManufacturerDTO;

/**
 *
 */
public interface ManufacturerService {
	
	ManufacturerDTO findOne(Integer id);
	
	List<ManufacturerDTO> findAll();

}

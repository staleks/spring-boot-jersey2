/**
 * 
 */
package rs.in.staleksit.demo.jersey2.web;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import rs.in.staleksit.demo.jersey2.dto.ManufacturerDTO;
import rs.in.staleksit.demo.jersey2.service.ManufacturerService;

/**
 *
 */
@Component
@Path("/manufacturers")
@Produces(MediaType.APPLICATION_JSON)
public class ManufacturerEndpoint {
	
	private ManufacturerService manufacturerService;
	
	@Autowired
	public ManufacturerEndpoint(@Qualifier("manufacturerService") ManufacturerService manufacturerService) {
		this.manufacturerService = manufacturerService;
	}
	
	@GET
	public List<ManufacturerDTO> findAll() {
		return manufacturerService.findAll();
	}
	
	@GET
	@Path("{id}")
	public ManufacturerDTO findOne(@PathParam("id") Integer id) {
		return manufacturerService.findOne(id);
	}

}

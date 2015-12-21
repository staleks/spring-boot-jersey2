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

import rs.in.staleksit.demo.jersey2.dto.PhoneModelDTO;
import rs.in.staleksit.demo.jersey2.service.PhoneModelService;

/**
 *
 */
@Component
@Path("/phonemodels")
@Produces(MediaType.APPLICATION_JSON)
public class PhoneModelEndpoint {
	
	private PhoneModelService phoneModelService;
	
	@Autowired
	public PhoneModelEndpoint(@Qualifier("phoneModelService") PhoneModelService phoneModelService) {
		this.phoneModelService = phoneModelService;
	}
	
	@GET
	public List<PhoneModelDTO> findAll() {
		return phoneModelService.findAll();
	}
	
	@GET
	@Path("{id}")
	public PhoneModelDTO findOne(@PathParam("id") Integer id) {
		return phoneModelService.findOne(id);
	}
	

}

/**
 * 
 */
package rs.in.staleksit.demo.jersey2.model.phone;

import rs.in.staleksit.demo.jersey2.model.manufacturer.Manufacturer;

/**
 *
 */
public interface PhoneModel {
	
	Integer getId();
	
	String getName();
	
	boolean isActive();
	
	Manufacturer getManufacturer();

}

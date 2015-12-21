/**
 * 
 */
package rs.in.staleksit.demo.jersey2.dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jtransfo.DomainClass;
import org.jtransfo.MappedBy;

import rs.in.staleksit.demo.jersey2.model.phone.PhoneModelImpl;

/**
 *
 */
@DomainClass(domainClass = PhoneModelImpl.class)
public class PhoneModelDTO implements Serializable {
	private static final long serialVersionUID = -7247749557505652738L;
	
	@MappedBy(field = "id")
	private Integer id;
	
	@MappedBy(field = "name")
	private String name;
	
	@MappedBy(field = "active")
	private boolean active;
	
	@MappedBy(field = "manufacturer", path = "id")
	private Integer manufacturerId;
	
	@MappedBy(field = "manufacturer", path = "name")
	private String manufacturerName;
	
	
	public PhoneModelDTO() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Integer getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}

}

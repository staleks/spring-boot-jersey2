/**
 * 
 */
package rs.in.staleksit.demo.jersey2.dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jtransfo.DomainClass;
import org.jtransfo.MappedBy;

import rs.in.staleksit.demo.jersey2.model.manufacturer.ManufacturerImpl;

/**
 *
 */
@DomainClass(domainClass = ManufacturerImpl.class)
public class ManufacturerDTO implements Serializable {
	private static final long serialVersionUID = -7389487557962362106L;
	
	@MappedBy(field = "id")
	private Integer id;
	
	@MappedBy(field = "name")
	private String name;
	
	@MappedBy(field = "active")
	private boolean active;
	
	
	public ManufacturerDTO() {
		
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
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}

}

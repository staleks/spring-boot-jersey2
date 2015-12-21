/**
 * 
 */
package rs.in.staleksit.demo.jersey2.model.manufacturer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import rs.in.staleksit.demo.jersey2.model.AbstractEntity;

/**
 *
 */
@Entity
@Table(name = "tbl_manufacturer")
public class ManufacturerImpl extends AbstractEntity implements Manufacturer {
	private static final long serialVersionUID = 5243018890277322511L;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "active", nullable = false)
	private boolean active;
	
	public ManufacturerImpl() {
		this.active = true;
	}
	
	public ManufacturerImpl(String name) {
		this.name = name;
		this.active = true;
	}
	
	public ManufacturerImpl(String name, boolean active) {
		this.name = name;
		this.active = active;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isActive() {
		return active;
	}
	
	public void setId(Integer id) {
		super.setId(id);
	};
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected String[] getExcludedFields() {
		return new String[] {};
	}
	
}

/**
 * 
 */
package rs.in.staleksit.demo.jersey2.model.phone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import rs.in.staleksit.demo.jersey2.model.AbstractEntity;
import rs.in.staleksit.demo.jersey2.model.manufacturer.Manufacturer;
import rs.in.staleksit.demo.jersey2.model.manufacturer.ManufacturerImpl;

/**
 *
 */
@Entity
@Table(name = "tbl_phonemodel")
public class PhoneModelImpl extends AbstractEntity implements PhoneModel {
	private static final long serialVersionUID = 8797476437133357847L;

	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "active", nullable = false)
	private boolean active;
	
	@ManyToOne(targetEntity = ManufacturerImpl.class)
	@JoinColumn(name = "manufacturer_id", nullable = false)
	private Manufacturer manufacturer;
	
	
	/**
	 * minimal constructor
	 */
	public PhoneModelImpl() {
		this.active = true;
	}
	
	public PhoneModelImpl(String name, Manufacturer manufacturer) {
		this.name = name;
		this.active = true;
		this.manufacturer = manufacturer;
	}
	
	public PhoneModelImpl(String name, boolean active, Manufacturer manufacturer) {
		this.name = name;
		this.active = active;
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isActive() {
		return active;
	}

	@Override
	protected String[] getExcludedFields() {
		return new String[] {};
	}

}

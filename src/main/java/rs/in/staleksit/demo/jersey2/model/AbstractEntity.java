package rs.in.staleksit.demo.jersey2.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 
 */
public abstract class AbstractEntity extends AbstractPersistable<Integer> {
	private static final long serialVersionUID = 6693137071495307816L;

	protected abstract String[] getExcludedFields();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		if (getExcludedFields().length != 0) {
			return ReflectionToStringBuilder.toStringExclude(this, getExcludedFields());
		} else {
			return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (getExcludedFields().length != 0) {
			return EqualsBuilder.reflectionEquals(this, obj, getExcludedFields());
		} else {
			return EqualsBuilder.reflectionEquals(this, obj);
		}	
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		if (getExcludedFields().length != 0) {
			return HashCodeBuilder.reflectionHashCode(this, getExcludedFields());
		} else {
			return HashCodeBuilder.reflectionHashCode(this);
		}			
	}

}

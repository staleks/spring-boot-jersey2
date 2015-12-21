/**
 * 
 */
package rs.in.staleksit.demo.jersey2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rs.in.staleksit.demo.jersey2.model.phone.PhoneModelImpl;

/**
 *
 */
public interface PhoneModelRepository extends JpaRepository<PhoneModelImpl, Integer> {

}

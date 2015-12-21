/**
 * 
 */
package rs.in.staleksit.demo.jersey2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rs.in.staleksit.demo.jersey2.model.manufacturer.ManufacturerImpl;

/**
 *
 */
public interface ManufacturerRepository extends JpaRepository<ManufacturerImpl, Integer> {

}

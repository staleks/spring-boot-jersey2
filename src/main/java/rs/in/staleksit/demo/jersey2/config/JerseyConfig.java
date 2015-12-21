/**
 * 
 */
package rs.in.staleksit.demo.jersey2.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import rs.in.staleksit.demo.jersey2.web.ManufacturerEndpoint;
import rs.in.staleksit.demo.jersey2.web.PhoneModelEndpoint;

/**
 *
 */
@Configuration
@ApplicationPath("api/v1")
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		packages("rs.in.staleksit.demo.jersey2");
		register(ManufacturerEndpoint.class);
		register(PhoneModelEndpoint.class);
	}

}

/**
 * 
 */
package rs.in.staleksit.demo.jersey2.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 *
 */
@Configuration
@Profile("develop")
public class DevelopPersistenceConfig extends AbstractPersistenceConfig {

	@Override
	public DataSource dataSource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		builder.setType(EmbeddedDatabaseType.H2);
		// builder.addScript("classpath:/rs/in/staleksit/evidencija/phonescatalog/sql/schema.sql");
		// builder.addScript("classpath:/rs/in/staleksit/evidencija/phonescatalog/sql/init-data.sql");
		return builder.build();
	}
}

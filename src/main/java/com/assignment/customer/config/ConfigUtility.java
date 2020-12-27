/**
 * 
 */
package com.assignment.customer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Utility class to retrieve value of custom-defined properties, mentioned in
 * application.properties
 * 
 * @author Payel
 *
 */
@Configuration
public class ConfigUtility {

	@Autowired
	private Environment env;

	public String getProperty(String pPropertyKey) {
		return env.getProperty(pPropertyKey);
	}

}

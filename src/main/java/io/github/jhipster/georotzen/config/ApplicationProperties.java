package io.github.jhipster.georotzen.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Angular Mongo DB 2018.
 * <p>
 * Properties are configured in the application.yml file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}

package com.vdev.microservice;

import com.vdev.microservice.IamServiceApp;
import com.vdev.microservice.config.AsyncSyncConfiguration;
import com.vdev.microservice.config.EmbeddedElasticsearch;
import com.vdev.microservice.config.EmbeddedKafka;
import com.vdev.microservice.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { IamServiceApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}

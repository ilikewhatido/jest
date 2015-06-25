package com.songhan.jest;

import com.songhan.jest.resources.JestResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

public class JestApplication extends Application<JestConfiguration> {

	public static void main(String[] args) throws Exception {
		new JestApplication().run(args);
	}

	@Override
	public void run(JestConfiguration arg0, Environment environment) throws Exception {
		final JestResource jestResource = new JestResource();
		environment.jersey().register(jestResource);
	}

	@Override
	public void initialize(Bootstrap<JestConfiguration> bootstrap) {
		bootstrap.addBundle(new ViewBundle<JestConfiguration>());
	}
}

package com.songhan.jest.resources;

import java.io.UnsupportedEncodingException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.songhan.jest.utils.StringEncoding;
import com.songhan.jest.views.FreeFormView;

@Path("/{what}/{from}/{to}")
@Produces(MediaType.TEXT_HTML + ";charset=" + StringEncoding.UTF8)
public class JestResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(JestResource.class);

	public JestResource() {}

	@GET
	public FreeFormView getPerson(@PathParam("what") String what, @PathParam("from") String from, @PathParam("to") String to) throws UnsupportedEncodingException {

		LOGGER.info("what=" + what + ", from=" + from + ", to=" + to);
		return new FreeFormView(
			StringEncoding.convertToUTF8(what), 
			StringEncoding.convertToUTF8(from), 
			StringEncoding.convertToUTF8(to));
	}
}

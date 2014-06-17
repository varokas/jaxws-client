package com.varokas.ws;

import static org.hamcrest.CoreMatchers.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;

public class EchoServiceTest {
	@Test
	public void shouldEcho() throws MalformedURLException {
		EchoServiceImplService echoServiceImpl = new EchoServiceImplService(new URL("http://localhost:8000/ws/echo?wsdl"));
		EchoService echoService = echoServiceImpl.getEchoServiceImplPort();
 
		Assert.assertThat(echoService.echo("testing"), is(equalTo("echo: testing")));
	}
}

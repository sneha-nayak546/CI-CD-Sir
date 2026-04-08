package com.example;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServletTest {

    @Test
    public void testDoGet() throws Exception {
        HelloServlet servlet = new HelloServlet();

        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        StringWriter sw = new StringWriter();
        PrintWriter writer = new PrintWriter(sw);

        when(response.getWriter()).thenReturn(writer);

        servlet.doGet(request, response);

        writer.flush();

        verify(response).setContentType("text/html");
        assert sw.toString().contains("Deployment Successful");
    }
}

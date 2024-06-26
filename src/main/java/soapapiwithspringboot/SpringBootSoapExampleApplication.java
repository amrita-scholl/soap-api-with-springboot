package soapapiwithspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

@EnableWs
@SpringBootApplication
public class SpringBootSoapExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSoapExampleApplication.class, args);
    }

}
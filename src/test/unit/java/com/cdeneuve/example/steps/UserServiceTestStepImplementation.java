package com.cdeneuve.example.steps;

import com.cdeneuve.example.TestApplication;
import com.cdeneuve.example.service.UserService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {TestApplication.class}, initializers = ConfigFileApplicationContextInitializer.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class UserServiceTestStepImplementation /*extends BaseStep*/ {

    @Autowired
    UserService userService;

    @Before
    public void setup_cucumber_spring_context() {
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
    }

    @Given("The TestApplication")
    public void theTestApplication() {
        System.out.println("TestApplication is starting........");
    }

    @Then("UserService is not null")
    public void userServiceIsNotNull() {
        assert userService != null;
    }
}
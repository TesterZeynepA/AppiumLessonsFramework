package Utils;

import io.cucumber.java.*;

public class Hooks {
    @BeforeAll
    public static void beforeAll() {
    }

    @Before
    public void before() {
        DriverFactory.setDriver();
    }

    @BeforeStep
    public void beforeStep() {
    }

    @AfterStep
    public void afterStep() {
    }

    @After
    public void after() {
        DriverFactory.quitDriver();
    }

    @AfterAll
    public static void afterAll() {
    }
}
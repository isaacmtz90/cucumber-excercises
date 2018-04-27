package shouty;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Stepdefs {
    Person lucy = new Person();
    Person sean = new Person();
    private String messagesFromSean;
    @Given("^Lucy is (\\d+)m from Sean$")
    public void luc_is_m_from_Sean(int distance) throws Throwable {
       lucy.setLocation(distance);
       sean.setLocation(0);
    }

    @When("^Sean shouts \"([^\"]*)\"$")
    public void sean_shouts(String message) {
        // Write code here that turns the phrase above into concrete actions
       sean.shout(message);
       messagesFromSean = message;
    }

    @Then("^Lucy should hear Sean's message$")
    public void lucy_should_hear_Sean_s_message() {
        if (lucy.getLocation() <=15){
            lucy.hearMessage(messagesFromSean);
        }
       assertEquals(asList(messagesFromSean), lucy.getMessagesHeard());
    }

}

package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.RegistroUtestData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenUp;
import tasks.Register;

import java.util.List;

public class registroUtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Mateo wants to enter the page$")
    public void thanMateoWantsToEnterThePage()  {
       OnStage.theActorCalled("Mateo").wasAbleTo(OpenUp.thePage());
    }

    @When("^He enters his datas$")
    public void heEntersHisDatas(List<RegistroUtestData> registroUtestData)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.the(registroUtestData.get(0).getStrName()
                ,registroUtestData.get(0).getStrLastName(),registroUtestData.get(0).getStrEmail(),
                registroUtestData.get(0).getStrMonth(),registroUtestData.get(0).getStrDay(),
                registroUtestData.get(0).getStrYear(),registroUtestData.get(0).getStrMobileDevice(),
                registroUtestData.get(0).getStrModel(),registroUtestData.get(0).getStrOS(),
                registroUtestData.get(0).getStrPassword(),registroUtestData.get(0).getStrConfirmPassword()));
    }

    @Then("^He finds the message$")
    public void heFindsTheMessage(DataTable arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }
}

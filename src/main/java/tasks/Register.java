package tasks;

import model.RegistroUtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.UtestRegistroPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userInterface.UtestRegistroPage.*;

public class Register implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strConfirmPassword;
    private String strPassword;

    public Register(String strName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strMobileDevice, String strModel, String strOS,String strPassword,String strConfirmPassword) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strOS = strOS;
        this.strPassword=strPassword;
        this.strConfirmPassword=strConfirmPassword;
    }

    public static Register the(String strName, String strLastName,String strEmail,String strMonth,String strDay, String strYear, String strMobileDevice, String strModel, String strOS,String strPassword,String strConfirmPassword) {
        return Tasks.instrumented(Register.class,strName,strLastName,strEmail,strMonth,strDay,strYear,strMobileDevice,strModel,strOS,strPassword,strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(UtestRegistroPage.REGISTER_BUTTON),
                Scroll.to(BUTTON_NEXT_LOCATION),
                WaitUntil.the(INPUT_NAME, isVisible()),
                WaitUntil.the(INPUT_NAME, isEnabled()),

                Enter.theValue(strName).into(INPUT_NAME),
                WaitUntil.the(INPUT_LASTNAME, isVisible()),
                WaitUntil.the(INPUT_LASTNAME, isEnabled()),

                Enter.theValue(strLastName).into(INPUT_LASTNAME),

                WaitUntil.the(INPUT_EMAIL, isVisible()),
                WaitUntil.the(INPUT_EMAIL, isEnabled()),
                Enter.theValue(strEmail).into(UtestRegistroPage.INPUT_EMAIL),



                WaitUntil.the(SELECT_MONTH, isVisible()),
                WaitUntil.the(SELECT_MONTH, isEnabled()),
                SelectFromOptions.byVisibleText("January").from(UtestRegistroPage.SELECT_MONTH),

                WaitUntil.the(SELECT_DAY, isVisible()),
                WaitUntil.the(SELECT_DAY, isEnabled()),
                SelectFromOptions.byVisibleText("1").from(UtestRegistroPage.SELECT_DAY),

                WaitUntil.the(SELECT_YEAR, isVisible()),
                WaitUntil.the(SELECT_YEAR, isEnabled()),
                SelectFromOptions.byVisibleText("1991").from(UtestRegistroPage.SELECT_YEAR),

                WaitUntil.the(BUTTON_NEXT_LOCATION, isVisible()),
                WaitUntil.the(BUTTON_NEXT_LOCATION, isEnabled()),
                Click.on(BUTTON_NEXT_LOCATION),

               Scroll.to(BUTTON_NEXT_DEVICES),
                WaitUntil.the(INPUT_CITY, isVisible()),
                WaitUntil.the(INPUT_CITY, isEnabled()),
                WaitUntil.the(INPUT_ZIP, isVisible()),
                WaitUntil.the(INPUT_ZIP, isEnabled()),
                WaitUntil.the(INPUT_COUNTRY, isVisible()),
                WaitUntil.the(INPUT_COUNTRY, isEnabled()),

                Click.on(UtestRegistroPage.BUTTON_NEXT_DEVICES),

                WaitUntil.the(CLICK_MOBILE, isVisible()),
                WaitUntil.the(CLICK_MOBILE, isEnabled()),
                Click.on(UtestRegistroPage.CLICK_MOBILE),

                WaitUntil.the(SELECT_MOBILE, isVisible()),
                WaitUntil.the(SELECT_MOBILE, isEnabled()),
                Click.on(UtestRegistroPage.SELECT_MOBILE),



                WaitUntil.the(SELECT_MOBILE_MODEL, isVisible()),
                WaitUntil.the(SELECT_MOBILE_MODEL, isEnabled()),

                Click.on(UtestRegistroPage.SELECT_MOBILE_MODEL),

                WaitUntil.the(CLICK_MOBILE_MODEL, isVisible()),
                WaitUntil.the(CLICK_MOBILE_MODEL, isEnabled()),
                Click.on(UtestRegistroPage.CLICK_MOBILE_MODEL),
                Scroll.to(BUTTON_LASTSTEP),
                WaitUntil.the(SELECT_MOBILE_OS, isVisible()),
                WaitUntil.the(SELECT_MOBILE_OS, isEnabled()),
                Click.on(UtestRegistroPage.SELECT_MOBILE_OS),

                WaitUntil.the(CLICK_MOBILE_OS, isVisible()),
                WaitUntil.the(CLICK_MOBILE_OS, isEnabled()),
                Click.on(UtestRegistroPage.CLICK_MOBILE_OS),


                WaitUntil.the(BUTTON_LASTSTEP, isVisible()),
                WaitUntil.the(BUTTON_LASTSTEP, isEnabled()),
                Click.on(UtestRegistroPage.BUTTON_LASTSTEP),

                WaitUntil.the(INPUT_PASSWORD, isVisible()),
                WaitUntil.the(INPUT_PASSWORD, isEnabled()),
                Enter.theValue(strPassword).into(UtestRegistroPage.INPUT_PASSWORD),

                WaitUntil.the(INPUT_CONFIRM_PASSWORD, isVisible()),
                WaitUntil.the(INPUT_CONFIRM_PASSWORD, isEnabled()),
                Enter.theValue(strConfirmPassword).into(UtestRegistroPage.INPUT_CONFIRM_PASSWORD),


                WaitUntil.the(SPAN_CHECKMARK1, isVisible()),
                WaitUntil.the(SPAN_CHECKMARK1, isEnabled()),
                Click.on(UtestRegistroPage.SPAN_CHECKMARK1),

                WaitUntil.the(SPAN_CHECKMARK2, isVisible()),
                WaitUntil.the(SPAN_CHECKMARK2, isEnabled()),
                Click.on(UtestRegistroPage.SPAN_CHECKMARK2),
                WaitUntil.the(BUTTON_COMPLETESETUP, isVisible()),
                WaitUntil.the(BUTTON_COMPLETESETUP, isEnabled()),
                Click.on(UtestRegistroPage.BUTTON_COMPLETESETUP));


    }

    private String strDay;
    private String strYear;
    private String strMobileDevice;
    private String strModel;
    private String strOS;
}

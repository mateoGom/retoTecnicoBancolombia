package tasks;

import model.RegistroUtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userInterface.UtestRegistroPage;
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
        actor.attemptsTo(Click.on(UtestRegistroPage.REGISTER_BUTTON),
                Enter.theValue(strName).into(UtestRegistroPage.INPUT_NAME),
                Enter.theValue(strLastName).into(UtestRegistroPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestRegistroPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("January").from(UtestRegistroPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("1").from(UtestRegistroPage.SELECT_DAY),
                SelectFromOptions.byVisibleText("1991").from(UtestRegistroPage.SELECT_YEAR),
                Click.on(UtestRegistroPage.BUTTON_NEXT_LOCATION),
                Click.on(UtestRegistroPage.BUTTON_NEXT_DEVICES),
                Click.on(UtestRegistroPage.CLICK_MOBILE),

                Click.on(UtestRegistroPage.SELECT_MOBILE),



                //input[@placeholder='Select Brand']
                //SelectFromOptions.byVisibleText("Apple").from(UtestRegistroPage.SELECT_MOBILE),

                Click.on(UtestRegistroPage.SELECT_MOBILE_MODEL),
                Click.on(UtestRegistroPage.CLICK_MOBILE_MODEL),

               // SelectFromOptions.byVisibleText("iPhone 4").from(UtestRegistroPage.SELECT_MOBILE_MODEL),


               // SelectFromOptions.byVisibleText("iOS 14").from(UtestRegistroPage.SELECT_MOBILE_OS),
                Click.on(UtestRegistroPage.SELECT_MOBILE_OS),
                Click.on(UtestRegistroPage.CLICK_MOBILE_OS),



                Click.on(UtestRegistroPage.BUTTON_LASTSTEP),
                Enter.theValue(strPassword).into(UtestRegistroPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(UtestRegistroPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestRegistroPage.SPAN_CHECKMARK1),
                Click.on(UtestRegistroPage.SPAN_CHECKMARK2),
                Click.on(UtestRegistroPage.BUTTON_COMPLETESETUP));
    }

    private String strDay;
    private String strYear;
    private String strMobileDevice;
    private String strModel;
    private String strOS;
}

package tasks;

import model.RegistroUtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.UtestRegistroPage;
public class Register implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;
    private String strMonth;

    public Register(String strName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strMobileDevice, String strModel, String strOS) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strOS = strOS;
    }

    public static Register onThePage(String strName, String strLastName,String strEmail,String strMonth,String strDay, String strYear, String strMobileDevice, String strModel, String strOS) {
        return Tasks.instrumented(Register.class,strName,strLastName,strEmail,strMonth,strDay,strYear,strMobileDevice,strModel,strOS);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UtestRegistroPage.REGISTER_BUTTON),
                Enter.theValue(strUser).into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON));
    }

    private String strDay;
    private String strYear;
    private String strMobileDevice;
    private String strModel;
    private String strOS;
}

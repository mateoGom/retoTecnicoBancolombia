package userInterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistroPage {

    public static final Target REGISTER_BUTTON= Target.the("boton para registrarse").located(By.xpath("//head//following::a[text()='Join Today'][1]"));
    public static final Target INPUT_NAME= Target.the("input nombre").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME= Target.the("input apellido").located(By.id("lastName"));
    public static final Target INPUT_EMAIL= Target.the("input email").located(By.id("email"));
    public static final Target SELECT_MONTH= Target.the("select mes de nacimiento").located(By.xpath("//select[@name='birthMonth']"));
    public static final Target SELECT_DAY= Target.the("select dia de nacimiento").located(By.xpath("//select[@name='birthDay']"));
    public static final Target SELECT_YEAR= Target.the("select año de nacimiento").located(By.xpath("//select[@name='birthYear']"));
    public static final Target CLICK_MOBILE= Target.the("click en select celular").located(By.xpath("//span[@aria-label='Select Brand']"));

    public static final Target SELECT_MOBILE= Target.the("select celular").located(By.xpath("//div[text()='Apple']"));
    public static final Target SELECT_MOBILE_MODEL= Target.the("select modelo de  celular").located(By.xpath("//span[@aria-label='Select a Model']"));
    public static final Target CLICK_MOBILE_MODEL= Target.the("click en  modelo de  celular").located(By.xpath("//div[text()='iPhone 4']"));

    public static final Target SELECT_MOBILE_OS= Target.the("select OS de  celular").located(By.xpath("//label[text()='Operating System:']//following::span[1]"));
    public static final Target CLICK_MOBILE_OS= Target.the("click  OS de  celular").located(By.xpath("//div[text()='iOS 11.2.1']"));


    public static final Target INPUT_PASSWORD= Target.the("input password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD= Target.the("input confirmar password").located(By.id("confirmPassword"));
    public static final Target SPAN_CHECKMARK1= Target.the("checkmark 1").located(By.xpath("//a[contains(text(),'uTest Code of Conduct')]//following::span[1]"));
    public static final Target SPAN_CHECKMARK2= Target.the("checkmark 2").located(By.xpath("//a[contains(text(),'uTest Code of Conduct')]//following::span[3]"));
    public static final Target BUTTON_NEXT_LOCATION= Target.the("boton next location").located(By.xpath("//span[text()='Next: Location']"));
    public static final Target BUTTON_NEXT_DEVICES= Target.the("boton next devices").located(By.xpath("//span[text()='Next: Devices']"));
    public static final Target BUTTON_LASTSTEP= Target.the("boton last step").located(By.xpath("//span[text()='Next: Last Step']"));
    public static final Target BUTTON_COMPLETESETUP= Target.the("boton complete setup").located(By.xpath("//span[text()='Complete Setup']"));











}

package userInterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistroPage {

    public static final Target REGISTER_BUTTON= Target.the("boton para registrarse").located(By.xpath("//a[text()='Join Today']"));
    public static final Target INPUT_NAME= Target.the("input nombre").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME= Target.the("input apellido").located(By.id("lastName"));
    public static final Target INPUT_EMAIL= Target.the("input email").located(By.id("email"));
    public static final Target SELECT_MONTH= Target.the("select mes de nacimiento").located(By.xpath("//select[@name='birthMonth']"));
    public static final Target SELECT_DAY= Target.the("select dia de nacimiento").located(By.xpath("//select[@name='birthDay']"));
    public static final Target SELECT_YEAR= Target.the("select año de nacimiento").located(By.xpath("//select[@name='birthYear']"));
    public static final Target SELECT_MOBILE= Target.the("select celular").located(By.xpath("//span[@aria-label='Select Brand']"));
    public static final Target SELECT_MOBIL_MODEL= Target.the("select modelo de  celular").located(By.xpath("//span[@aria-label='Select a Model']"));
    public static final Target SELECT_MOBIL_MODEL= Target.the("select modelo de  celular").located(By.xpath("//span[@aria-label='Select a Model']"));









}

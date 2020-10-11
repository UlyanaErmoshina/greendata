
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;


public class greenDataTest {


    @Test

        void shouldLogIn () {
        open("https://gdcloud.ru/release-17/auth/login");
        SelenideElement form = $(".checkbox");
        form.$("[input id=username] input").setValue("tester");
        form.$("[input id=password] input").setValue("K35G3U");
        form.$(".login-button").click();

    }
}

package Framework;

import Pages.*;
import io.appium.java_client.android.AndroidDriver;

/* Driver wrapper */
public class App {

    public static AndroidDriver driver;

    public static ContactManagerHomePage ContactManagerHomePage() {
        return new ContactManagerHomePage();
    }
    public static ContactManagerAddContactPage ContactManagerAddContactPage() {
        return new ContactManagerAddContactPage();
    }

}

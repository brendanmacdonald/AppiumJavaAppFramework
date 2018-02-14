package Pages;

import Framework.AppControl;
import org.openqa.selenium.By;

/**
 * Google 'Image' page
 */
public class ContactManagerHomePage {

    public ContactManagerHomePage() {
        /* Empty constructor */
    }

    // Page elements.
    public AppControl contactList = new AppControl(By.id("com.example.android.contactmanager:id/contactList"));
    public By contactEntry = By.id("com.example.android.contactmanager:id/contactEntryText");
    public AppControl showInvisibleCheckBox = new AppControl(By.id("com.example.android.contactmanager:id/showInvisible"));
    public AppControl addContactBtn = new AppControl(By.id("com.example.android.contactmanager:id/addContactButton"));
}

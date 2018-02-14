package Pages;

import Framework.AppControl;
import org.openqa.selenium.By;

/**
 * Google 'Image' page
 */
public class ContactManagerAddContactPage {

    public ContactManagerAddContactPage() {
        /* Empty constructor */
    }

    // Page elements.
    public AppControl contactNameField = new AppControl(By.id("com.example.android.contactmanager:id/contactNameEditText"));
    public AppControl contactPhoneField = new AppControl(By.id("com.example.android.contactmanager:id/contactPhoneEditText"));
    public AppControl contactEmailField = new AppControl(By.id("com.example.android.contactmanager:id/contactEmailEditText"));
    public AppControl saveBtn = new AppControl(By.id("com.example.android.contactmanager:id/contactSaveButton"));
}

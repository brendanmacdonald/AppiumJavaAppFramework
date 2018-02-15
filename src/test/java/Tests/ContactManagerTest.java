package Tests;

import Framework.App;
import Framework.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class ContactManagerTest extends TestBase {

    @Test
    @Parameters({"name", "phone", "email"})
    public void addAContact(String name, String phone, String email) {
        // Click 'Add Contact' on the homepage.
        App.ContactManagerHomePage().addContactBtn.click();

        // Add new contact details, and save.
        App.ContactManagerAddContactPage().contactNameField.sendKeys(name);
        App.ContactManagerAddContactPage().contactPhoneField.sendKeys(phone);
        App.ContactManagerAddContactPage().contactEmailField.sendKeys(email);
        App.ContactManagerAddContactPage().saveBtn.click();

        // Confirm homepage is displayed, and the new contact is listed.
        Assert.assertTrue(App.ContactManagerHomePage().contactList.isDisplayed());
        App.ContactManagerHomePage().showInvisibleCheckBox.click();
        List<WebElement> contactListEntries =  App.ContactManagerHomePage().contactList.findElements(App.ContactManagerHomePage().contactEntry);

        for(WebElement entry : contactListEntries) {
            System.out.println(entry.getText());
        }
    }
}

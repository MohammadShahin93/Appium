package Pages;

import framework.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Created by mohammad on 3/29/18.
 */
public class LandingPage extends BaseAction{

    @AndroidFindBy(id = "com.hcom.android:id/btnPositive")
    @iOSFindBy(accessibility = "yesButton")
    private MobileElement yesButton;

    @AndroidFindBy(accessibility = "Open drawer menu")
    private MobileElement mainMenu;

    @AndroidFindBy(id = "com.hcom.android:id/drawer_header_sign_in")
    private MobileElement signInButton;

    public void tapOnYesButton() {
        tapOn(yesButton);
    }

    public void tapOnMainMenuButton() {
        tapOn(mainMenu);
    }

    public void tapOnSignInButton() {
        tapOn(signInButton);
    }
}

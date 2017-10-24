import org.testng.annotations.Test;

import java.io.File;

public class FirstTest {

    @Test
    public void firstTest() throws Exception {

        // FOR WINDOWS USERS
        File projectPath = new File(System.getProperty("user.dir"));
        System.setProperty("webdriver.gecko.driver",projectPath + "/drivers/windows/geckodriver.exe");


    }
}

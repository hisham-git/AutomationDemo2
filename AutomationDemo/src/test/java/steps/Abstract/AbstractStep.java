package steps.Abstract;

import org.testng.ITestResult;

import net.phptravels.pages.Header;
import net.phptravels.pages.Login;
import net.phptravels.pages.MyAccount;
import net.phptravels.pages.Register;

/**
 * Created by maksym.tkachov on 6/23/2016.
 */
public abstract class AbstractStep {
    protected ITestResult result;
    protected Register register;
    protected MyAccount myAccount;
    protected Header header;
    protected Login login;
}

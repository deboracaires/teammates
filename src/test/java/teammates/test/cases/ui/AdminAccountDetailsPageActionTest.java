package teammates.test.cases.ui;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import teammates.common.Common;
import teammates.common.datatransfer.DataBundle;
import teammates.ui.controller.ControllerServlet;

public class AdminAccountDetailsPageActionTest extends BaseActionTest {

	DataBundle dataBundle;
	
	
	@BeforeClass
	public static void classSetUp() throws Exception {
		printTestClassHeader();
		URI = Common.PAGE_ADMIN_ACCOUNT_DETAILS;
		sr.registerServlet(URI, ControllerServlet.class.getName());
	}

	@BeforeMethod
	public void caseSetUp() throws Exception {
		dataBundle = getTypicalDataBundle();
		restoreTypicalDataInDatastore();
	}
	
	@Test
	public void testAccessControl() throws Exception{
		String[] submissionParams = new String[]{};
		verifyOnlyAdminsCanAccess(submissionParams);
	}

	
	@Test
	public void testExecuteAndPostProcess() throws Exception{
		
		//TODO: implement this
	}
	

}

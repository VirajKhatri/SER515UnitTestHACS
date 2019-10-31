package hacs;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FacadeTest {

	Facade facade = new Facade();
	ClassCourseList classCourseList = new ClassCourseList();

	@Test
	void testFacade() {
		System.out.println("Facade object created.");
	}

	@Test
	void testSubmitSolution() {
		Assignment theAssignment = new Assignment();
		Solution theSolution = new Solution();
		facade.submitSolution(theAssignment, theSolution);
		assertEquals(1, theAssignment.getTheSolutionList().size());
	}

	@Test
	void testCreateUser() {
		UserInfoItem userInfoItem = new UserInfoItem();
		userInfoItem.userType = UserInfoItem.USER_TYPE.Student;
		facade.createUser(userInfoItem);
		assertTrue(facade.thePerson instanceof Student);
	}

	@Test
	void testCreateCourseList() {
		facade.createCourseList();
		assertEquals(3, facade.theCourseList.size());
	}

	@Test
	void testAttachCourseToUser() {
		UserInfoItem userInfoItem = new UserInfoItem();
		userInfoItem.userType = UserInfoItem.USER_TYPE.Student;
		userInfoItem.strUserName = "yaya";
		facade.createUser(userInfoItem);
		facade.createCourseList();
		facade.attachCourseToUser();
		assertEquals(2, facade.thePerson.getCourseList().size());
	}

}

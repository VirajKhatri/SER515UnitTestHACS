package hacs;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FacadeTest {

	Facade facade = new Facade();
	ClassCourseList classCourseList = new ClassCourseList();

	@Test
	void testSubmitSolution() {
		int expected = 1;
		Assignment theAssignment = new Assignment();
		Solution theSolution = new Solution();
		facade.submitSolution(theAssignment, theSolution);
		assertEquals(expected, theAssignment.getTheSolutionList().size());
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
		int expected = 3;
		facade.createCourseList();
		assertEquals(expected, facade.theCourseList.size());
	}

	@Test
	void testAttachCourseToUser() {
		int expected = 2;
		UserInfoItem userInfoItem = new UserInfoItem();
		userInfoItem.userType = UserInfoItem.USER_TYPE.Student;
		userInfoItem.strUserName = "yaya";
		facade.createUser(userInfoItem);
		facade.createCourseList();
		facade.attachCourseToUser();
		assertEquals(expected, facade.thePerson.getCourseList().size());
	}

}

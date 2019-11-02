package hacs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ClassCourseListTest {

	ClassCourseList classCourseList = new ClassCourseList();

	@Test
	void testInitializeFromFile() {
		int expected = 3;
		classCourseList.initializeFromFile("CourseInfo.txt");
		assertEquals(expected, classCourseList.size());
	}

	@Test
	void testFindCourseByCourseName() {
		String courseName = "CSE890";
		classCourseList.initializeFromFile("CourseInfo.txt");
		assertEquals(courseName, classCourseList.findCourseByCourseName(courseName).toString());
	}

}

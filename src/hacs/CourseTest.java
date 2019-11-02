package hacs;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CourseTest {

	String strCourse = "SER 515";
	int theLevel = 0;
	Course course = new Course(strCourse, theLevel);
	Assignment assignment = new Assignment();

	@Test
	void testCourse() {
		assertEquals(strCourse, course.toString());
		assertEquals(theLevel, course.getCourseLevel());
	}

	@Test
	void testAddAssignment() {
		int expected = 1;
		course.addAssignment(assignment);
		assertEquals(expected, course.assignmentList.size());
	}

	@Test
	void testToString() {
		assertEquals(strCourse, course.toString());
	}

	@Test
	void testAccept() {
		course.accept(new ReminderVisitor());
		assertTrue(course.isAccepted());
	}

}

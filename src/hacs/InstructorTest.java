package hacs;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class InstructorTest {

	Instructor instructor = new Instructor();

	@Test
	void testCreateCourseMenu() {
		CourseMenu courseMenu = instructor.createCourseMenu(new Course("SER 515", 0), 0);
		assertTrue(courseMenu instanceof HighLevelCourseMenu);
	}

	@Test
	void testInstructor() {
		int expected = 1;
		assertEquals(expected, instructor.type);
	}

}

package hacs;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StudentTest {

	Student student = new Student();

	@Test
	void testStudent() {
		assertEquals(0, student.type);
	}

	@Test
	void testCreateCourseMenu() {
		CourseMenu courseMenu = student.createCourseMenu(new Course("SER 515", 0), 0);
		assertTrue(courseMenu instanceof HighLevelCourseMenu);
	}

}

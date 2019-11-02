package hacs;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CourseIteratorTest {

	CourseIterator courseIterator = new CourseIterator();
	ClassCourseList classCourseList = new ClassCourseList();

	@Test
	void testCourseIteratorClassCourseList() {
		int expected = 1;
		Course course = new Course("SER 515", 1);
		classCourseList.add(course);
		courseIterator = new CourseIterator(classCourseList);
		assertEquals(expected, courseIterator.getTheCourseList().size());
	}

	@Test
	void testHasNext() {
		Course course = new Course("SER 515", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertTrue(courseIterator.hasNext());
	}

	@Test
	void testNext() {
		Course course = new Course("SER 515", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertNotNull(courseIterator.next());
	}

	@Test
	void testRemove() {
		int expected = 0;
		Course course = new Course("SER 515", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		courseIterator.next();
		courseIterator.remove();
		assertEquals(expected, courseIterator.getTheCourseList().size());
	}

	@Test
	void testNextString() {
		Course course = new Course("SER 515", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertNotNull(courseIterator.next("SER 515"));
	}

}

package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	Solution solution = new Solution();

	@Test
	void testSolution() {
		System.out.println("Solution object created");
	}

	@Test
	void testToString() {
		solution.setTheAuthor("Viraj Khatri");
		solution.setSolutionFileName("Solution");
		assertEquals("Viraj Khatri Solution Grade = 0 not reported.", solution.toString());
	}

	@Test
	void testGetGradeString() {
		assertEquals("-1", solution.getGradeString());
	}

	@Test
	void testGetGradeInt() {
		assertEquals(0, solution.getGradeInt());
	}

	@Test
	void testSetReported() {
		solution.setReported(true);
		assertTrue(solution.isReported());
	}

	@Test
	void testIsReported() {
		solution.setReported(true);
		assertTrue(solution.isReported());
	}

}

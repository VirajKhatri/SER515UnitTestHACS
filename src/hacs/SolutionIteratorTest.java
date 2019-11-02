package hacs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionIteratorTest {

	SolutionList solutionList = new SolutionList();
	Solution solution = new Solution();

	@Test
	void testSolutionIterator() {
		new SolutionIterator();
	}

	@Test
	void testSolutionIteratorSolutionList() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertTrue(solutionIterator.hasNext());
	}

	@Test
	void testMoveToHead() {
		int expected = -1;
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		solutionIterator.moveToHead();
		assertEquals(expected, solutionIterator.getCurrentSolutionNumber());
	}

	@Test
	void testHasNext() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertTrue(solutionIterator.hasNext());
	}

	@Test
	void testNext() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertNotNull(solutionIterator.next());
	}

	@Test
	void testNextString() {
		solution.setTheAuthor("Viraj Khatri");
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertNotNull(solutionIterator.next("Viraj Khatri"));
	}

	@Test
	void testRemove() {
		int expected = 0;
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		solutionIterator.next();
		solutionIterator.remove();
		assertEquals(expected, solutionIterator.solutionlist.size());
	}

}

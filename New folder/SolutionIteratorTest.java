package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionIteratorTest {

	SolutionList solutionList = new SolutionList();
	Solution solution = new Solution();

	@Test
	void testSolutionIterator() {
		System.out.println("SolutionIterator implemented.");
	}

	@Test
	void testSolutionIteratorSolutionList() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertTrue(solutionIterator.hasNext());
	}

	@Test
	void testMoveToHead() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		solutionIterator.moveToHead();
		assertEquals(-1, solutionIterator.getCurrentSolutionNumber());
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
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		solutionIterator.next();
		solutionIterator.remove();
		assertEquals(0, solutionIterator.solutionlist.size());
	}

}

package hacs;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class AssignmentTest {

	Assignment assignment = new Assignment();
	Solution solution = new Solution();

	@Test
	void testSetDueDate() {
		Date dueDate = new Date();
		assignment.setDueDate(dueDate);
		assertEquals(dueDate, assignment.getDueDate());
	}

	@Test
	void testSetAssignmentSpecification() {
		String input = "SER 515 Assignment should be done without plagarism";
		assignment.setAssignmentSpecification(input);
		assertEquals(input, assignment.getAssignmentSpecification());
	}

	@Test
	void testIsOverDue() {
		assertEquals(true, assignment.isOverDue());
	}

	@Test
	void testAddSolution() {
		int expected = 1;
		assignment.addSolution(solution);
		assertEquals(expected, assignment.getTheSolutionList().size());
	}

	@Test
	void testSubmitSolution() {
		assignment.submitSolution();
	}

	@Test
	void testGetSolution() {
		solution.setTheAuthor("Viraj Khatri");
		assignment.addSolution(solution);
		assertEquals("Viraj Khatri", assignment.getSolution("Viraj Khatri").getTheAuthor());
	}

	@Test
	void testGetSuggestSolution() {
		assertTrue(assignment.getSuggestSolution() instanceof Solution);
	}

	@Test
	void testGetSolutionIterator() {
		int expected = 0;
		SolutionIterator solutionIterator = assignment.getSolutionIterator();
		assertEquals(expected, solutionIterator.solutionlist.size());
	}

	@Test
	void testToString() {
		String input = "SER 515 Assigment";
		assignment.setAssignmentName(input);
		assertEquals(input, assignment.toString());
	}

	@Test
	void testGetDueDateString() {
		Date dueDate = new Date();
		assignment.setDueDate(dueDate);
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		assertEquals(dateFormat.format(dueDate), assignment.getDueDateString());
	}

	@Test
	void testAccept() {
		assignment.accept(new ReminderVisitor());
		assertTrue(assignment.isAccepted());
	}

}

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
	void testAssignment() {
		System.out.println("assignment object created.");
	}

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
		assignment.addSolution(solution);
		assertEquals(1, assignment.getTheSolutionList().size());
	}

	@Test
	void testSubmitSolution() {
		System.out.println("submitSolution object created.");
	}

	@Test
	void testGetSolutionList() {
		System.out.println("getSolutionList object created.");
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
		SolutionIterator solutionIterator = assignment.getSolutionIterator();
		assertEquals(0, solutionIterator.solutionlist.size());
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

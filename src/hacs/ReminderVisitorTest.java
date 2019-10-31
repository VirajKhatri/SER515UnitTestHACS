package hacs;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

class ReminderVisitorTest {

	@Test
	void testVisitAssignment() {
		ReminderVisitor reminderVisitor = new ReminderVisitor(new Reminder());
		Assignment assignment = new Assignment();
		assignment.setAssignmentName("SER 515");
		assignment.setDueDate(new Date());
		reminderVisitor.visitAssignment(assignment);
		assertNotNull(reminderVisitor.getmReminder().listUpcoming);
	}

	@Test
	void testReminderVisitor() {
		System.out.println("ReminderVisitor implemented.");
	}

	@Test
	void testReminderVisitorReminder() {
		ReminderVisitor reminderVisitor = new ReminderVisitor(new Reminder());
		assertNotNull(reminderVisitor.getmReminder());
	}

}

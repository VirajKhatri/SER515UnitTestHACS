/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */
package hacs;

import java.awt.Button;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class Reminder extends JDialog {

	private static final long serialVersionUID = 1L;
	ClassCourseList courseList;
	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	java.awt.List listUpcoming = new java.awt.List();
	java.awt.List listOverDue = new java.awt.List();
	Button buttonOk = new Button();

	public Reminder() {
		try {
			jbInit();
			setModal(true);
			setSize(400, 386);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		jLabel1.setText("Upcoming assignments");
		jLabel1.setBounds(new Rectangle(38, 40, 159, 17));
		this.getContentPane().setLayout(null);
		jLabel2.setText("OverDue Assignments");
		jLabel2.setBounds(new Rectangle(39, 160, 161, 17));
		listUpcoming.setBounds(new Rectangle(29, 65, 340, 79));
		listOverDue.setBounds(new Rectangle(31, 187, 337, 85));
		buttonOk.setLabel("OK");
		buttonOk.setBounds(new Rectangle(149, 308, 67, 37));
		buttonOk.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonOkActionPerformed(e);
			}
		});
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(jLabel2, null);
		this.getContentPane().add(listUpcoming, null);
		this.getContentPane().add(listOverDue, null);
		this.getContentPane().add(buttonOk, null);
	}

	void showReminder(ClassCourseList courseList) {
		ReminderVisitor visitor = new ReminderVisitor(this);
		visitor.visitFacade(Hacs.theFacade);
		setVisible(true);
	}

	void buttonOkActionPerformed(ActionEvent e) {
		setVisible(false);
	}
}
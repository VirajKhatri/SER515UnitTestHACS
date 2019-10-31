/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

package hacs;

import javax.swing.JDialog;

abstract public class AssignmentMenu extends JDialog {

	private static final long serialVersionUID = 1L;

	abstract void showMenu(Assignment assignment, Person person);

	public AssignmentMenu() {
		setModal(true);
		setSize(575, 330);
	}
}
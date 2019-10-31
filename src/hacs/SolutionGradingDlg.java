/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

package hacs;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SolutionGradingDlg extends JDialog {

	private static final long serialVersionUID = 1L;
	Solution theSolution;
	JLabel jLabel1 = new JLabel();
	JTextField tfGrad = new JTextField();
	JButton buttonOk = new JButton();
	JLabel labelSolutionFileName = new JLabel();

	public SolutionGradingDlg() {
		try {
			jbInit();
			setSize(316, 186);
			setModal(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		jLabel1.setText("Solution File Name");
		jLabel1.setBounds(new Rectangle(23, 30, 121, 18));
		this.getContentPane().setLayout(null);
		tfGrad.setBounds(new Rectangle(25, 66, 100, 22));
		buttonOk.setText("OK");
		buttonOk.setBounds(new Rectangle(217, 67, 79, 29));
		buttonOk.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonOkActionPerformed(e);
			}
		});
		labelSolutionFileName.setBounds(new Rectangle(212, 34, 163, 18));
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(tfGrad, null);
		this.getContentPane().add(labelSolutionFileName, null);
		this.getContentPane().add(buttonOk, null);
	}

	void show(Solution solution) {
		theSolution = solution;
		tfGrad.setText("" + theSolution.getGradeInt());
		labelSolutionFileName.setText(theSolution.solutionFileName);
		setVisible(true);
	}

	void buttonOkActionPerformed(ActionEvent e) {
		theSolution.theGrade = Integer.parseInt(tfGrad.getText());
		setVisible(false);
	}

}
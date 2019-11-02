/**
 * Title: HACS Description: CSE870 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 * 
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * 
 *          update to Java 8
 */

package hacs;

import java.util.Date;

public class Solution {
	String theAuthor = "";
	String solutionFileName = "";
	Date theSubmitData = new Date();
	int theGrade;
	boolean reported = false;

	public Solution() {
		System.out.println("Solution Implemented ");
	}

	public String getTheAuthor() {
		return theAuthor;
	}

	@Override
	public String toString() {
		String string = theAuthor + " " + solutionFileName + " Grade = " + getGradeInt();
		if (isReported())
			string += " reported.";
		else
			string += " not reported.";
		return (string);
	}

	public void setSolutionFileName(String solutionFileName) {
		this.solutionFileName = solutionFileName;
	}

	public void setTheAuthor(String theAuthor) {
		this.theAuthor = theAuthor;
	}

	String getGradeString() {
		if (isReported())
			return "" + theGrade;
		else
			return "-1";
	}

	int getGradeInt() {
		return theGrade;
	}

	public void setReported(boolean reported) {
		this.reported = reported;
	}

	public boolean isReported() {
		return reported;
	}
}
/**
 * Title:        HACS
 * Description:  CSE870 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 */
package hacs;

import java.text.DateFormat;
import java.util.Date;

public class Assignment {

	protected String assignmentName;
	protected String stringAssignmentFilename;
	protected Date dueDate = new Date();
	protected String assignmentSpecification;
	protected SolutionList theSolutionList = new SolutionList();
	protected Solution suggestSolution = new Solution();
	boolean accepted = false;

	public boolean isAccepted() {
		return accepted;
	}

	public Assignment() {
		System.out.println("Assignment implemented");
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public void setDueDate(Date theDueDate) {
		this.dueDate = theDueDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setAssignmentSpecification(String theSpec) {
		this.assignmentSpecification = theSpec;
	}

	public String getAssignmentSpecification() {
		return assignmentSpecification;
	}

	public boolean isOverDue() {
		Date today = new Date();
		if (today.after(this.dueDate)) {
			return true;
		} else {
			return false;
		}
	}

	public Solution addSolution() {
		Solution mySolution = new Solution();
		return mySolution;
	}

	// add the theSolution to the Solution list
	public void addSolution(Solution theSolution) {
		theSolutionList.add(theSolution);
	}

	public SolutionList getTheSolutionList() {
		return theSolutionList;
	}

	public void submitSolution() {
		System.out.println("Submit Solution Implemented");
	}

	public void getSolutionList() {
		System.out.println("Get Solution Implemented");
	}

	// return the solution of the give name
	public Solution getSolution(String studentname) {
		SolutionIterator Iterator = getSolutionIterator();
		return (Solution) Iterator.next(studentname);
	}

	public Solution getSuggestSolution() {
		return suggestSolution;
	}

	public SolutionIterator getSolutionIterator() {
		SolutionIterator theSolutionIterator = new SolutionIterator(theSolutionList);
		return theSolutionIterator;
	}

	public String toString() {
		return assignmentName;
	}

	public String getDueDateString() {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		return dateFormat.format(dueDate);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visitAssignment(this);
		accepted = true;
	}
}
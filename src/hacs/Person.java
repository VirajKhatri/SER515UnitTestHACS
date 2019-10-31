/**
 * Title: HACS Description: CSE870 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 * 
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 */

package hacs;

import java.util.Iterator;

abstract public class Person {
	int type = 0; // type=0 : student, type=1 instructor
	String userName;
	ClassCourseList courseList;
	CourseMenu theCourseMenu;
	Course currentCourse;
	Assignment currentAssignment;

	public Person() {
		courseList = new ClassCourseList();
	}

	abstract public CourseMenu createCourseMenu(Course theCourse, int theLevel);

	public void showAddButton() {
		theCourseMenu.showAddButtons();
	}

	public void showViewButtons() {
		theCourseMenu.showViewButtons();
	}

	public void showComboxes() {
		theCourseMenu.showComboxes();
	}

	public void showRadios() {
		theCourseMenu.showRadios();
	}

	public void show() {
		theCourseMenu.setVisible(true);
	}

	public boolean ifLogout() {
		return theCourseMenu.ifLogout();
	}

	// show the assignment list
	public boolean showMenu() {
		// create a iterator for the assignment list
		// Iterator theIter=new ListIterator(CurrentCourse.AssList );
		Iterator<?> theIter = currentCourse.assignmentList.iterator();
		theCourseMenu.theCourse = currentCourse;
		Assignment theAssignment;
		while (theIter.hasNext()) {
			theAssignment = (Assignment) theIter.next();
			theCourseMenu.assignmentCombox.addItem(theAssignment);
		}
		return false;
	}

	public ClassCourseList getCourseList() {
		return courseList;
	}

	public void addCourse(Course theCourse) {
		courseList.add(theCourse);
	}
}
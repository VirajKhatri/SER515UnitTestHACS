/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * 
 *          Update to Java 8
 */

package hacs;

public class UserInfoItem {

	public enum USER_TYPE {
		Student, Instructor
	}

	String strUserName;
	USER_TYPE userType; // 0 : Student, 1: Instructor
}
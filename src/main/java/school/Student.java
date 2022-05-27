package school;

import java.util.ArrayList;

public class Student {
	private String studentName;
	private int studentID;
	private Subject majorSubject;
	
	private ArrayList<Score> scoreList = new ArrayList<>();
	
	public Student(int studentID, String studentName, Subject majorSubject) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getstudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public Subject getMajorSubject() {
		return majorSubject;
	}
	
	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}
	
	public ArrayList<Score> getScoreList() {
		return scoreList;
	}
	
	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
}

package school;

public class Score {
	int studentID;   	// 학번
	Subject subject;	// 과목
	int point;			// 점수
	
	public Score(int studentID, Subject subject, int point) {
		this.studentID = studentID;
		this.subject = subject;
		this.point = point;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public String toString() {
		return "학번:" + studentID + "," + subject.getSubjectName() + ":" + point;
	}
}

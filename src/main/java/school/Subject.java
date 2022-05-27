package school;

import java.util.ArrayList;

import utils.Define;

public class Subject {
	private String subjectName;	// 과목이름
	private int subjectID;		// 과목 고유 번호
	private int gradeType;		// 학점 평가 정책
	
	// 이 과목을 수강 신청한 학생 리스트. register()메서드를 호출하면 이 리스트에 추가됨.
	private ArrayList<Student> studentList = new ArrayList<>();
	
	public Subject(String subjectName, int subjectID) {
		this.subjectName = subjectName; 	
		this.subjectID = subjectID;			
		this.gradeType = Define.AB_TYPE;	
	}
	
	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public String getSubjectName() { //get : 필드의 선언된 멤버변수의 데이터타입을 설정
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) { // set 할때는 그냥 void 해놓으면 됨.
		this.subjectName = subjectName;
	}
	
	// 수강 신청 메서드
	public void register(Student student) {
		studentList.add(student);
	}
}

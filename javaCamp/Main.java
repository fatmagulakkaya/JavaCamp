package javaCamp;

public class Main {

	public static void main(String[] args) {
		
		Course course1= new Course(1,100,"Programlamaya Giri� ��in Temel Kurs ","Engin Demirog");
		
		Course course2= new Course(2,72,"Yazilim Gelistici Yetistirme (C#+ANGULAR) ","Engin Demirog");
		
		Course course3= new Course(3,63,"Yazilim Gelistici Yetistirme (JAVA+REACT) ","Engin Demirog");

		StudentManager courseStudent = new StudentManager();
		courseStudent.addCourse(course1);
		courseStudent.studentManager(course1);
		
		courseStudent.addCourse(course2);
		courseStudent.studentManager(course2);
		
		courseStudent.addCourse(course3);
		courseStudent.studentManager(course3);

		Course[] courses= {course1,course2,course3};
		
		for(Course course: courses) {
			System.out.println("Kurs ID : " +course.courseId);
			System.out.println("Kurs Ad� : " +course.courseName);
			System.out.println("Kurs E�itmeni : " +course.intructorName);
			System.out.println("Kurs Sayisi: "+courses.length);
		}

	}

	}


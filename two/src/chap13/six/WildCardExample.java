package chap13.six;

import java.util.Arrays;

public class WildCardExample {
	
	/*public static void registerCourse( Course<?> course ) {// 전부다 불러옴
	
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudent( Course<? extends Student> course ) {// Student와 HighStudent만 불러옴
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker( Course<? super Worker> course ) {//Worker 와 person만 불러옴
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}
	
	  public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5); // 배열이 5개 생성됨
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highstudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highstudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highstudentCourse);
		
		System.out.println();
		
		registerCourse(studentCourse);
		registerCourse(highstudentCourse);
		
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		
	}*/
	

}

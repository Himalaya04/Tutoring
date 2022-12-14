package eveningClass;

import java.util.*;

public class School {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();


        studentList.add(new Student(1,"Himal",3.9));
        studentList.add(new Student(2,"chandra",3.2));
        studentList.add(new Student(3,"shambu",3.9));
        studentList.add(new Student(4,"gajendra",3.5));
        studentList.add(new Student(5,"sanjay",3.7));

        Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed().
                thenComparing(Student::getFname).thenComparing(Student::getId));
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }

    }
}

package JavaSchool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaheshSchool {
    public static void main(String [] args) {

        Map<String,Double> marks = new HashMap<>();
        marks.put("Science", 3.4);
        marks.put("math", 4.0);
        marks.put("social", 3.5);
        marks.put("computer", 2.4);

        MarkSheet studentMarks = new MarkSheet(marks);


        Student S1= new Student("Ram", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", studentMarks);
        Student S2= new Student("Shyam", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", studentMarks);
        Student S3= new Student("Hari", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", studentMarks);
        Student S4= new Student("Sani", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", studentMarks);
        Student S5= new Student("Krihna", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", studentMarks);
        Student S6= new Student("Priya", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", studentMarks);
        Student S7= new Student("Supriya", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", studentMarks);
        List<Student> section1 = new ArrayList<>();
        section1.add(S1);
        section1.add(S2);
        section1.add(S3);
        section1.add(S4);
        List<Student> section2 = new ArrayList<>();
        section2.add(S5);
        section2.add(S6);
        section2.add(S7);
        List<Section> class5sections = new ArrayList<>();
        Section section_1= new Section("Section 1", section1 );
        System.out.println("average GPA of " + section_1.getNameOfSection() + " is " + section_1.getAverageGPA());
        Section section_2= new Section("Section 2", section2 );
        System.out.println("average GPA of " + section_2.getNameOfSection() + " is " + section_2.getAverageGPA());
        class5sections.add(section_1);
        class5sections.add(section_2);

        ClassRoom class1 = new ClassRoom(7, "class5", class5sections);
    }

}

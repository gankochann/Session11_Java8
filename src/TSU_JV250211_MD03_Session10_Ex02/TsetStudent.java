package TSU_JV250211_MD03_Session10_Ex02;

import javax.sql.rowset.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TsetStudent {
    public static void main(String[] args) {
        List<Student> listStudents = Arrays.asList(
                new Student("A" , 20 , 5.5),
                new Student("B" , 22 , 6.6),
                new Student("C" , 23 , 7.7),
                new Student("D" , 24 , 8.8),
                new Student("E" , 26 ,6),
                new Student("F" , 23 ,7.8),
                new Student("G" , 26 ,6.0),
                new Student("H" , 22 ,8.2),
                new Student("I" , 20 ,7.8),
                new Student("K" , 21 ,9)
        );
        List<Student> list = listStudents.stream().filter(student -> student.getGrade()>=7).sorted(Comparator.comparing(Student::getName)).toList();
        //hien thi dsach
        System.out.println("danh dach sinh vien co diem >= 7 , sap xep theo ten la:");
        list.forEach(Student::displayData);

    }
}

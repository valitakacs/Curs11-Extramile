package org.FastTrackIt.Tema11;

import java.util.List;

public class Main {
    public static void main(String[] args)throws  Exception {
        StudentReader reader= new StudentReader();
        reader.readFile("grades.txt");
        List<StudentGrade> students = reader.readFile("grades.txt");
        System.out.println(students);

        ClassRoom classRoom = new ClassRoom(students);
        System.out.println(classRoom.getGrades("Computer Science"));
    }
}

package org.FastTrackIt.Tema11;

import org.FastTrackIt.Curs04.Array;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentReader {
    public List<StudentGrade> readFile(String fileLocation) throws Exception{
        Scanner scanner = new Scanner(new FileReader(fileLocation));
        List<StudentGrade> students= new ArrayList<>();
        while(scanner.hasNextLine()){
            StudentGrade studentGrade= fetchStudentGrade(scanner.nextLine());
            students.add(studentGrade);
        }
        return students;
    }
    private StudentGrade fetchStudentGrade (String line){
        String [] tokens =line.split("\\|");
        System.out.println(Arrays.toString(tokens));
        return new StudentGrade(tokens[0],tokens[1],Integer.parseInt(tokens[2]));
    }
}

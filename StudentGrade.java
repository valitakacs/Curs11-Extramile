package org.FastTrackIt.Tema11;

import java.util.Objects;

public class StudentGrade {
        private final String name;
        private final String discipline;
        private final int grade;


    public StudentGrade(String name, String discipline,int grade){
            this.name=name;
            this.discipline=discipline;
            this.grade=grade;

        }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getGrade() {
        return grade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrade that = (StudentGrade) o;
        return
                Objects.equals(name, that.name) &&
                Objects.equals(discipline, that.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, discipline, grade);
    }
}

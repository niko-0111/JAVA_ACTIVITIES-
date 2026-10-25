/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expert;

/**
 *
 * @author Sanchez
 */
public class ClassRankingSystem {
       
    static class Student {
        String name;
        int[] quizzes;
        double average;

        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;

            int total = 0;

            for (int i = 0; i < quizzes.length; i++) {
                total += quizzes[i];
            }

            average = (double) total / quizzes.length;
        }
    }

    public static void main(String[] args) {

        String[] names = {"Curs", "Yuan", "Thirdy", "Fotich", "Elwin", "Raph"};

        int[][] quizData = {
            {90, 85, 88, 92},
            {85, 90, 87, 88},
            {95, 94, 96, 93},
            {80, 85, 82, 83},
            {95, 94, 96, 93},
            {88, 86, 90, 84}
        };

        Student[] students = new Student[quizData.length];

        for (int i = 0; i < quizData.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("==================================");
        System.out.println("          CLASS RANKING           ");
        System.out.println("==================================");
        System.out.printf("%-6s %-9s %s%n", "Rank", "Name", "Average");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average == students[i - 1].average) {
            } else {
                rank = i + 1;
            }

            System.out.printf("%-6d %-9s %.2f%n",
                    rank, students[i].name, students[i].average);
        }

        String searchName = "John";
        int found = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(searchName)) {
                found = i;
                break;
            }
        }

        if (found != -1) {
            rank = found + 1;

            while (rank > 1 &&
                   students[rank - 1].average == students[rank - 2].average) {
                rank--;
            }

            System.out.println();
            System.out.println("Student searched: " + searchName);
            System.out.printf("Average: %.2f%n", students[found].average);
            System.out.println("Rank: " + rank);
        } else {
            System.out.println("Student not found.");
        }
    }
}

package Task4_2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentsList studentsList = new StudentsList();
        Student student = new Student();

        System.out.println("欢迎进入学生管理系统：");

        Scanner cin = new Scanner(System.in);
        String name;
        String course;
        int score;
        while(true) {
            int opt = ScreenShow.showOptions();
            ScreenShow.showCLS();
            if (opt == 1) { // ADD
                System.out.println("Please input the name of the student you want to add");
                name = cin.nextLine();
                studentsList.addStudent(name);
            } else if (opt == 2) {
                System.out.println("Please input the name of the student you want to add");
                name = cin.nextLine();
                System.out.println("Please input the course you want to add");
                course = cin.nextLine();
                System.out.println("Please input the score you want to add");
                score = cin.nextInt();
                studentsList.addStudentCourse(name, course , score);
            }
            else if (opt == 3) {
                System.out.println("Please input the name of the student you want to modify");
                name = cin.nextLine();
                System.out.println("Please input the course you want to modify");
                course = cin.nextLine();
                System.out.println("Please input the score you want to modify");
                score = cin.nextInt();
                studentsList.updateStudentCourse(name, course, score);
            }
            else if (opt == 4) {
                System.out.println("Please input the name of student you want to delete");
                name = cin.nextLine();
                studentsList.deleteStudent(name);
            }
            else if (opt == 5) {
                System.out.println("Please input the name of student you want to delete");
                name = cin.nextLine();
                System.out.println("Please input the course you want to delete");
                course = cin.nextLine();
                studentsList.deleteStudentCourse(name, course);
            }
            else if (opt == 6) {
                studentsList.showAllStudents();
            }
            else if (opt == 7) {
                System.out.println("Please input the course you want to search");
                course = cin.nextLine();
                studentsList.showAllStudentsCourse(course);
            }
            else if (opt == 8) {
                System.out.println("Please input the name of the student you want to search");
                name = cin.nextLine();
                studentsList.showStudent(name);
            }
            else if (opt == 9) {
                System.out.println("Please input the name of the student you want to search");
                name = cin.nextLine();
                System.out.println("Please input the course you want to search");
                course = cin.nextLine();
                studentsList.showStudentCourse(name, course);
            }
            else if (opt == 10) {
                System.out.println("Please input the course you want to search");
                course = cin.nextLine();
                studentsList.findMaxScore(course);
            }
            else if (opt == 11) {
                System.out.println("Please input the course you want to search");
                course = cin.nextLine();
                studentsList.findMinScore(course);
            }
            else if (opt == 0) {
                break;
            }
            new Scanner(System.in).nextLine();
            ScreenShow.showCLS();
        }
    }
}

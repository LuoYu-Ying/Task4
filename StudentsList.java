package Task4_2_1;

import java.util.ArrayList;

public class StudentsList {
    private Student student = new Student();
    private ArrayList<Student> students = new ArrayList<>();

    public StudentsList() {

    }

    public boolean judgeEmpty() {
        if(students.size() > 0) return true;
        return false;
    }

    public boolean judgeStudent(String name) {
        for(Student e : students) {
            if(e.getName().equals(name))
                return true;
        }
        return false;
    }

    public void addStudent(String name) {
        if(judgeStudent(name))
            System.out.println("你已经添加了这位学生了");
        else {
            student.setName(name);
            students.add(student);
        }
    }

    public void addStudentCourse(String name, String course, int score) {
        if(!judgeStudent(name)) {
            student.setName(name);
            student.addNewCourse(course, score);
            students.add(student);
        }
        else {
            for(Student e : students) {
                if (e.getName().equals(name)) {
                    e.addNewCourse(course, score);
                    break;
                }
            }
        }
    }

    public void deleteStudent(String name) {
        if(!judgeStudent(name))
            System.out.println("未找到此学生");
        else {
            for (Student e : students) {
                if (e.getName().equals(name)) {
                    student = e;
                    break;
                }
            }
            students.remove(student);
        }
    }

    public void deleteStudentCourse(String name, String course) {
        if(!judgeStudent(name))
            System.out.println("未找到此学生");
        else {
            for(Student e : students) {
                if (e.getName().equals(name)) {
                    e.deleteCourse(course);
                    break;
                }
            }
        }
    }

    public void updateStudentCourse(String name, String course, int score) {
        if(!judgeStudent(name))
            System.out.println("未找到此学生");
        else {
            for(Student e : students) {
                if (e.getName().equals(name)) {
                    e.updateCourse(course, score);
                    break;
                }
            }
        }
    }

    public void findMaxScore(String course) {
        student.updateCourse(course, -1);
        if(!judgeEmpty())
            System.out.println("系统中没有学生");
        else {
            for(Student e : students) {
                if(e.getScoreOfCourse(course) > student.getScoreOfCourse(course))
                    student = e;
            }
        }
        System.out.println(course + "的最高分为" + student.getName() + "的" + student.getScoreOfCourse(course) + "分");
    }

    public void findMinScore(String course) {
        student.updateCourse(course, 500);
        if(!judgeEmpty())
            System.out.println("系统中没有学生");
        else {
            for(Student e : students) {
                if(e.getScoreOfCourse(course) < student.getScoreOfCourse(course))
                    student = e;
            }
        }
        System.out.println(course + "的最低分为" + student.getName() + "的" + student.getScoreOfCourse(course) + "分");
    }

    public void showStudent(String name) {
        if(!judgeStudent(name))
            System.out.println("未找到此学生");
        else {
            for(Student e : students) {
                if (e.getName().equals(name)) {
                    e.showAllCourse();
                    break;
                }
            }
        }
    }

    public void showStudentCourse(String name, String course) {
        if(!judgeStudent(name))
            System.out.println("未找到此学生");
        else {
            for(Student e : students) {
                if (e.getName().equals(name)) {
                    e.showOneCourse(course);
                    break;
                }
            }
        }
    }

    public void showAllStudents() {
        if(!judgeEmpty())
            System.out.println("系统中没有学生");
        else {
            for (Student e : students) {
                e.showAllCourse();
            }
        }
    }

    public void showAllStudentsCourse(String course) {
        if(!judgeEmpty())
            System.out.println("系统中没有学生");
        else {
            for (Student e : students) {
                e.showOneCourse(course);
            }
        }
    }
}

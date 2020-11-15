package Task4_2_1;

import java.util.ArrayList;

public class Student{
    private String name;
    private Course course = new Course();
    private ArrayList<Course> courses = new ArrayList<>();

    public Student() {
        this.name = "";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean judgeEmpty() {
        if(courses.size() > 0) return true;
        return false;
    }

    public boolean judgeCourse(String aCourse) {
        for(Course e : courses) {
            if(e.getCourse().equals(aCourse))
                return true;
        }
        return false;
    }

    public void addNewCourse(String aCourse, int aScore) {
        if(!judgeCourse(aCourse)) {
            course.setCourse(aCourse);
            course.setScore(aScore);
            courses.add(course);
        }
        else System.out.println("你已经添加了这门学科了");
    }

    public void showOneCourse(String aCourse) {
        for(Course e : courses) {
            if(e.getCourse().equals(aCourse)) {
                System.out.println(getName() + "的" + aCourse + "学科的成绩为" + e.getScore() + "分");
                break;
            }
        }
    }

    public void showAllCourse() {
        System.out.println(getName() + "的成绩为：");
        for(Course e : courses) {
            System.out.println(e.getCourse() + " : " + e.getScore());
        }
    }

    public int getScoreOfCourse(String aCourse) {
        for(Course e : courses) {
            if (e.getCourse().equals(aCourse)) {
                course = e;
                break;
            }
        }
        return course.getScore();
    }

    public void deleteCourse(String aCourse) {
        for(Course e : courses) {
            if(e.getCourse().equals(aCourse)) {
                course = e;
                break;
            }
        }
        courses.remove(course);
    }

    public void updateCourse(String aCourse, int aScore) {
        for(Course e : courses) {
            if (e.getCourse().equals(aCourse)) {
                e.setScore(aScore);
                break;
            }
        }
    }
}

package Task4_2_1;

public class Course {
    private String course;
    private int score;

    public Course() {
        this.course = "";
        this.score = 0;
    }

    public Course(String course) {
        this.course = course;
    }

    public Course(String course, int score) {
        this.course = course;
        this.score = score;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

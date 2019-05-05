package ir.mousavi.training.model;

import java.util.Date;

public class Course
{
    int id;
    String courseName;
    Date courseStartDate;

    public Course(int id, String courseName , Date courseStartDate) {
        this.id = id;
        this.courseName = courseName;
        this.courseStartDate = courseStartDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(Date courseStartDate) {
        this.courseStartDate = courseStartDate;
    }
}

package ir.mousavi.training.service;

import ir.mousavi.training.model.Course;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Path("/course")
public class CourseService {

    public List<Course> getCourseList() {
        List<Course> courses = new ArrayList<Course>();
        courses.add(new Course(1, "angular", new Date("2019/03/01")));
        courses.add(new Course(2, "webArchitecture", new Date("2019/03/01")));
        courses.add(new Course(3, "reactJs", new Date("2019/07/01")));
        courses.add(new Course(4, "vueJs", new Date("2019/08/01")));
        courses.add(new Course(5, "springBoot", new Date("2019/05/01")));
        return courses;
    }

    @GET
    @Path("/getDateOfCourse/{param}")
    public Response getCourseName(@PathParam("param") String name) throws  Exception {
        List<Course> getCourses = getCourseList();
//        String currentStartDate = getCourses.stream().filter(f -> f.getCourseName().equals(name))
//                .findAny().orElse(null).getCourseStartDate().toString();
        String currentStartDate = "20190505";
        String output = "Your Course is : " + name + "| Start Date is : " + currentStartDate;
        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }
}

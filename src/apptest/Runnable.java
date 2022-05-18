package apptest;

import apptest.model.*;
import apptest.repository.RoleRepository;
import apptest.service.RoleService;
import apptest.service.impl.RoleServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 5/15/2022
 * Time: 3:57 PM
 */
public class Runnable {
    public static RoleService roleService = new RoleServiceImpl();

    public static void main(String[] args) {
        roleService.save(new Role("STUDENT"));
        roleService.save(new Role("TEACHER"));
        roleService.save(new Role("DIRECTOR"));
        //RoleRepository.viewRoles();

        Role roleStudent = roleService.findByRoleName("student");
        Role roleTeacher = roleService.findByRoleName("teacher");
        Role roleDirector = roleService.findByRoleName("director");
        Role roleManager = roleService.findByRoleName("manager");
        if(roleManager == null)
            throw new RuntimeException("Manager Role Not Found!");

        List<User> userList = new ArrayList<>();
        userList.add(new User("Ali Aliyev", roleStudent));
        userList.add(new User("Salim", roleTeacher));
        userList.add(new User("Karim", roleDirector));

        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("Matematika"));
        subjects.add(new Subject("Fizika"));
        subjects.add(new Subject("Informatika"));

        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question("Suv nechchi gradusda qaynaydi?", subjects.get(1)));

        List<Answer> answerList = new ArrayList<>();
        answerList.add(new Answer("80 gradus", false, questionList.get(0)));
        answerList.add(new Answer("90 gradus", false, questionList.get(0)));
        answerList.add(new Answer("100 gradus", true, questionList.get(0)));

    }
}

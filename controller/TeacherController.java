package controller;

import model.User;
import service.TeacherService;

public class TeacherController implements UserController {

     TeacherService teacherService = new TeacherService();

    
    public void createTeacher(int id, String name, String lastName){
        teacherService.createTeacher(id, name, lastName);
    }

    public void teacherSendOnConsole(){
        teacherService.teacherSendOnConsole(teacherService.getAllTeachers());
    }

    public void deliteTeacher(int id){
       teacherService.deliteTeacher(id);
    }

    public void editTeacher(int id, String name, String lastName){
        teacherService.editTeacher(id, name, lastName);
    }


    @Override
    public <T extends User> User create(T user) {
        return user;
    }
    
}

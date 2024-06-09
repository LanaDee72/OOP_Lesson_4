package controller;

import model.User;
import service.StudentService;


public class StudentController implements UserController {

    

    StudentService studentService = new StudentService();

    
    public void createStudent(int id, String name, String lastName){
        studentService.createStudent(id, name, lastName);
    }

    public void studentSendOnConsole(){
        studentService.studentSendOnConsole(studentService.getAllStudents());
    }

    public void deliteStudent(int id){
        studentService.deliteStudent(id);
    }

    public void editStudent(int id, String name, String lastName){
        studentService.editStudent(id, name, lastName);
    }


    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    

}
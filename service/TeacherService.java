package service;

import java.util.ArrayList;
import java.util.List;

import model.Teacher;
import view.TeacherView;
import view.UserView;

public class TeacherService {
    
    private UserView<Teacher> view = new TeacherView();
    private List<Teacher> allTeachers = new ArrayList<>();
    

    public List<Teacher> getAllTeachers(){
        return allTeachers;
    }

    public void createTeacher(int id, String name, String last) {
        allTeachers.add(new Teacher(id, name, last));
    }

    public void deliteTeacher(int id){
        for (Teacher teacher : allTeachers) {
            if(teacher.getId() == id){
                allTeachers.remove(teacher);
            }
        }
    }

    public void teacherSendOnConsole(List<Teacher> allTeachers) {
        view.sendOnConsole(allTeachers);
    }


    public void editTeacher(int id, String name, String lastName){
        for (Teacher teacher : allTeachers) {
            if(teacher.getId() == id){
                teacher.setName(name);
                teacher.setLastName(lastName);
            }
        }

    }
}

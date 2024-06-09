package service;


import java.util.ArrayList;
import java.util.List;

import model.Student;
import view.StudentView;
import view.UserView;


public class StudentService {

    private UserView<Student> view = new StudentView();
    private List<Student> allStudents = new ArrayList<>();
    

    public List<Student> getAllStudents(){
        return allStudents;
    }

    public void createStudent(int id, String name, String last) {
        allStudents.add(new Student(id, name, last));
    }

    public void deliteStudent(int id){
        for (Student student : allStudents) {
            if(student.getId() == id){
                allStudents.remove(student);
            }
        }
    }

    public void studentSendOnConsole(List<Student> allStudents) {
        view.sendOnConsole(allStudents);
    }


    public void editStudent(int id, String name, String lastName){
        for (Student student : allStudents) {
            if(student.getId() == id){
                student.setName(name);
                student.setLastName(lastName);
            }
        }

    }



}

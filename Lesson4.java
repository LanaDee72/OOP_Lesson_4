

import controller.StudentController;
import controller.TeacherController;
import model.Student;


public class Lesson4 {

    public static void main(String[] args) {

        StudentController studentController = new StudentController();
        
        studentController.createStudent(3, "Anna", "Ross");
        studentController.createStudent(1, "Jake", "Smit");
        studentController.createStudent(2, "Nik", "Toy");
        studentController.create(new Student(8, "xxx", "ccc"));

        // Проверка работы методов
        studentController.studentSendOnConsole(); // Вывод в консоль
        studentController.deliteStudent(2); // Удаление студента по id
        studentController.editStudent(3, "Anna", "Jons"); // Редактирование студента
        studentController.studentSendOnConsole();


        TeacherController teacherController = new TeacherController();

        teacherController.createTeacher(5, "Kevin", "Pass");
        teacherController.createTeacher(6, "Olga", "Romanoff");
        teacherController.createTeacher(4, "Max", "Ruth");

        // Проверка работы методов
        teacherController.teacherSendOnConsole();
        teacherController.deliteTeacher(5);
        teacherController.editTeacher(6, "Olga", "Simmons");
        teacherController.teacherSendOnConsole();

        
                        
    }
}
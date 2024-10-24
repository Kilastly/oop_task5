package view;

import controller.Controller;
import data.Teacher;


public class TeacherView {
    private Controller controller = new Controller();

    public void createTeacher(Teacher teach){
        controller.createUser(teach, teach.getDiscipline());
        System.out.println("Преподователь успешно создан!");
    }

    public void readTeacher(){
        System.out.println("Список преподователей:");
        controller.read("teacher");
      }
}

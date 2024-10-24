import data.Student;
import data.Teacher;
import view.StudentView;
import view.TeacherView;

public class main {
    public static void main(String[] args) {
        Student stud1 = new Student("Говард", 21, "Инжинер");
        Student stud2 = new Student("Леонард", 21, "Физик - эксперементатор");
        Student stud3 = new Student("Радж", 20, "Астрофизик");
        Student stud4 = new Student("Шелдон", 18, "Физик - теоретик");
        Teacher teach1 = new Teacher("Стерженс", 65, "Физика");
        Teacher teach2 = new Teacher("Линклеттер", 61, "Теория поля");



        StudentView stView = new StudentView();
        stView.createStudent(stud1);
        stView.createStudent(stud2);
        stView.createStudent(stud3);
        stView.createStudent(stud4);

        stView.readStudent();

        TeacherView tView = new TeacherView();
        tView.createTeacher(teach1);
        tView.createTeacher(teach2);

        tView.readTeacher();
    }
}
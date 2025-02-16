import models.Student;
import models.Group;

public class Main {
    public static void main(String[] args) {
        Group group = new Group(); // Создаём группу

        // 🔹 Создаём и добавляем студентов в группу
        for (String name : new String[]{"Андрей", "Елена", "Иван", "Мария", "Сергей", "Ольга"})
            group.addStudent(new Student(name));

        group.printStudents(); // 🔹 Выводим список студентов
    }
}

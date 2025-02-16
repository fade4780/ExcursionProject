package models; // Указываем, что класс находится в пакете "models"

import java.util.ArrayList;
import java.util.List;

public class Group {
    private static final int MAX_STUDENTS = 3; // 🔹 Константа: максимум 3 студента в группе
    private List<Student> students = new ArrayList<>(); // 🔹 Список студентов

    // 🔹 Метод добавления студента в группу
    public void addStudent(Student student) {
        if (students.size() < MAX_STUDENTS) {
            students.add(student); // Добавляем, если есть место
            System.out.println(student + " добавлен в группу.");
        } else {
            System.out.println("⚠ Группа заполнена! Нельзя добавить: " + student);
        }
    }

    // 🔹 Метод для вывода всех студентов группы
    public void printStudents() {
        System.out.println("\n📋 Группа студентов: " + students);
    }
}

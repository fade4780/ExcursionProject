package models; // Указываем, что класс в пакете "models"

public class Group {
    private static final int MAX_STUDENTS = 3; //  Максимум 3 студента
    private Student[] students = new Student[MAX_STUDENTS]; //  Обычный массив студентов
    private int count = 0; //  Количество добавленных студентов

    //  Метод добавления студента
    public void addStudent(Student student) {
        if (count < MAX_STUDENTS) { // Если есть место, добавляем
            students[count] = student;
            count++; // Увеличиваем счётчик
            System.out.println(student + " добавлен в группу.");
        } else {
            System.out.println("⚠ Группа заполнена! Нельзя добавить: " + student);
        }
    }

    //  Метод вывода списка студентов
    public void printStudents() {
        System.out.print("\n📋 Группа студентов: ");
        for (int i = 0; i < count; i++) {
            System.out.print(students[i] + (i < count - 1 ? ", " : ""));
        }
        System.out.println(); // Перевод строки после списка
    }
}

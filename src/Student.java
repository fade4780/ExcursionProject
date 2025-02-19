package models; // Указываем пакет (пространство имён)

public class Student {
    private String name; // Имя студента

    public Student(String name) { // Конструктор
        this.name = name;
    }

    @Override
    public String toString() { // Полиморфизм: переопределение метода toString()
        return name;
    }
}

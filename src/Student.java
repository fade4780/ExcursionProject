package models; // Указываем пакет (пространство имён)

public class Student {
    private String name; // Имя студента (закрытая переменная)

    public Student(String name) { // Конструктор для создания студента
        this.name = name;
    }

    @Override
    public String toString() { // Полиморфизм: переопределение метода вывода
        return name;
    }
}
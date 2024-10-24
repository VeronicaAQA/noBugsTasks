package org.example;

import org.example.task1.Book;
import org.example.task2.Student;
import org.example.task3.Point;

public class Main {
    public static void main(String[] args) {
        //task 1 - "Книга"
        Book book1 = new Book();
        book1.setYear(1949);
        book1.setAuthor("Джордж Оруэлл");
        book1.setName("1984");

        //int test = book1.getYear();
        //System.out.println(test);

        book1.print();

        //task 2 - "Студент"
        Student student1 = new Student();
        student1.setName("Nica");
        student1.setAverageMark(777);
        student1.setGradeBook(5);

        student1.print();

        //task 3 - "Точка на плоскости"
        Point point1 = new Point();
        point1.setX(48);
        point1.setY(2);

        point1.moveUp();
        point1.moveDown();
        point1.moveLeft();
        point1.moveRight();

    }
}


/**
 * Создайте класс Book c полями для хранения названия, автора и года издания.
 * Реализуйте методы для получения и установки этих полей. Cоздайте интерфейс Dispayable
 * с методом display(), который реализуется в классе Book для отображения информации о книге
 */


/**
 * Задача "Студент"
 * Создайте класс Student с полями для хранения имени, номера зачётной и среднего балла.
 * Реализуйте методы для получения и установки этих полей.
 * Создайте интерфейс Printable с методом print() для вывода информации о студенте
 */

/** Задача "Точка на плоскости"
 * Создайте класс Point с приватными полями х и у для координат точки на плоскости.
 * Реализуйте методы для получения (get) и установки (set) этих полей.
 * Создайте интерфейс Movable с методом moveUp(), moveDown(), moveLeft() и moveRight() для
 * изменения положения точки
 */
/**
 * Задача "часы"
 * Создайте класс Clock с полями для хранения часов, минут и секунд.
 * Реализуйте методы для установки и получения времени а также метод tick() для увеличения времени
 * на 1 секунду. Создайте интерфейс Readable с методом readTime(), который выводят текущее время часов
 */
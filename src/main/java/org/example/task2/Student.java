package org.example.task2;

public class Student implements Printable {
    private String name;
    private int gradeBook;
    private int averageMark;

    public void setName(String name){
        this.name = name;
    }
    public void setGradeBook(int gradeBook){
        this.gradeBook = gradeBook;
    }
    public void setAverageMark(int averageMark){
        this.averageMark = averageMark;
    }

    public String getName(){
        return this.name;
    }
    public int getGradeBook(){
        return this.gradeBook;
    }
    public int getAverageMark(){
        return this.averageMark;
    }

    @Override
    public void print() {
        System.out.println("Student's name: " + name);
        System.out.println("Book grade: " + gradeBook);
        System.out.println("Average mark: " + averageMark);
    }
}

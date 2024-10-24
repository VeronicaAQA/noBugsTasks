package org.example.task1;

//шаблон для создания объекта
public class Book implements Dispayable {
    private String author;
    private String name;
    private int year;

    //сеттеры
    public void setYear(int year){
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name){
        this.name = name;
    }

    //геттеры
    public int getYear(){
        return this.year;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("Книгу '" + this.name + "' издал " + this.author + " в " + this.year + " году");
    }
}

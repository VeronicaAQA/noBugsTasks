package org.example.task3;

public class Point implements Movable {
    private int x;
    private int y;

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    @Override
    public void moveUp() {
        setY(getY() + 1);
        System.out.println(y);
    }

    @Override
    public void moveDown() {
        setY(getY() - 1);
        System.out.println(y);
    }

    @Override
    public void moveLeft() {
        setX(getX() - 1);
        System.out.println(x);
    }

    @Override
    public void moveRight() {
        setX(getX() + 1);
        System.out.println(x);
    }
}
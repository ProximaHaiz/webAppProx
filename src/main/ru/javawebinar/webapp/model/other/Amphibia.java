package main.ru.javawebinar.webapp.model.other;

class A{
    int x=0;

    public A(int x) {
        this.x = x;
        System.out.println("x= " +  x);
    }
    public A(){
        System.out.println("from A default");
    }
}

public class Amphibia extends A  {
    int y=10;

    public Amphibia(int x, int y) {
        super(x);
        this.y = y;
        System.out.println("y = " +y);
    }
    public Amphibia(){
        System.out.println("Amph");
    }


    public static void main(String[] args) {
        new Amphibia();


    }
}

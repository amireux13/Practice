import java.util.Scanner;

public class Apple {
    String color;
    double price;
    String size;
    String productor;
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.color = "白色";
        apple.price = 10;
        apple.size = "大";
        apple.productor = "富士山";
        System.out.println(apple.color+apple.productor+apple.size);
        System.out.println(String.format("%.2f",apple.price));
    }
}

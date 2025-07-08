package TSU_JV250211_MD03_Session10_Ex04;

import java.util.Scanner;
import java.util.SortedMap;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: "+ name + ", price: "+price;
    }

    public void inputData(Scanner scanner){
        System.out.println("moi nhap vao id :");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.println("moi nhap vao name:");
        this.name = scanner.nextLine();
        System.out.println("moi nhap vao price:");
        this.price = Double.parseDouble(scanner.nextLine());


    }
}

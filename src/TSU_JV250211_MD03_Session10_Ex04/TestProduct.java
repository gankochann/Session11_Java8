package TSU_JV250211_MD03_Session10_Ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestProduct {
    private static Map<Integer , Product> productMap = new HashMap<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("++++++++++PRODUCT MANAGEMENT SYSTEM+++++++++++");
            System.out.println("1. Add product");
            System.out.println("2. Edit product");
            System.out.println("3. Delete product");
            System.out.println("4. Display all product");
            System.out.println("5. Filter product (price >  100)");
            System.out.println("6. Total Value of Product");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    editProduct(scanner);
                    break;
                case 3:
                    deleteProduct(scanner);
                    break;
                case 4:
                    displayAllProduct(scanner);
                    break;
                case 5:
                    filterProduct();
                    break;
                case 6:
                    totalPrice();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("vui long chon 1-7");
                    break;
            }
        }while (true);
    }

    //pt add
    public static void addProduct(Scanner scanner){
        System.out.println("moi nhap vao so luong muon them:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0 ; i < n ; i++){
            Product product = new Product();
            product.inputData(scanner);
            productMap.put(product.getId() , product);
        }
    }

    //pt edit
    public static void editProduct(Scanner scanner){
        System.out.println("moi nhap vao id ban muon sua:");
        int editId = Integer.parseInt(scanner.nextLine());
        int editIndex = findIndexById(editId);
        if(editIndex == -1) {
            System.err.println("id ban nhap khong ton tai!!!");
        }else {
            System.out.println("moi nhap vao newName:");
            String newName = scanner.nextLine();
            System.out.println("moi nhap vao newPrice:");
            double newPrice = Double.parseDouble(scanner.nextLine());
            productMap.put(editId , new Product(editId , newName , newPrice));
            System.out.println("cap nhat thanh cong!!!!");
        }
    }

    //pt ktra id
    public static Integer findIndexById(Integer id){
        for (int i = 0 ; i < productMap.size() ; i++){
            if(productMap.containsKey(id) ){
                return i;
            }
        }
        return -1;
    }

    //pt xoa
    public static void deleteProduct(Scanner scanner){
        System.out.println("moi nhap vao id can xoa:");
        int deleteId = Integer.parseInt(scanner.nextLine());
        int indexDelete = findIndexById(deleteId);
        if(indexDelete == -1){
            System.err.println("id ban nhap khong ton tai!!!");
        }else {
            productMap.remove(deleteId);
            System.out.println("xoa thanh cong!!!");
        }
    }

    //pt hien thi thong tin
    public static void displayAllProduct(Scanner scanner){
        if(productMap.isEmpty()){
            System.err.println("mang trong, vui long nhap thong tin de tiep tuc,,,");
        }
        else {
            productMap.values().forEach(System.out::println);
        }
    }

    //pt loc
    public static void filterProduct(){
        System.out.println("danh sach san pham co gia > 100:");
        productMap.values().stream().filter(product -> product.getPrice() > 100).forEach(System.out::println);
    }

    //pt tinh tong gia tri
    public static void totalPrice(){
        double sum = productMap.values().stream().mapToDouble(Product::getPrice).sum();
        System.out.println("tong gia la: " + sum);

    }
}

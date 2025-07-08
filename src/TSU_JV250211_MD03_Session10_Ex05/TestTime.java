package TSU_JV250211_MD03_Session10_Ex05;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestTime {
    public static List<Event> events = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("moi nhap ten su kien hoac 'exit'de thoat chuong trinh:");
            String eventName = scanner.nextLine();
            if(eventName.isBlank()){
                System.err.println("vui long khong de trong!!!");
            }else if (eventName.equalsIgnoreCase("exit")){
                System.exit(0);
            }else {
                System.out.println("nhap thoi gian bat dau: (dd-MM-yyyy HH:mm) ");
                String regexDate = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4}) (0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])$";
                String start = scanner.nextLine();

                if(start.matches(regexDate)){
                    System.out.println("moi nhap vao t.gian ket thuc:");
                    String end = scanner.nextLine();
                    if (end.matches(regexDate)){
                        Event event = new Event(eventName,start,end);
                        events.add(event);
                        events.forEach(event1 -> System.out.println(event1.toString()));
                    }
                }
            }
        }while (true);
    }
}

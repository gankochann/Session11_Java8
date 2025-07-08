package TSU_JV250211_MD03_Session10_Ex03;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestMessage {
    private static List<Message> messageList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap ten nguoi gui (nhan exit de thoat)");
            String sentder = scanner.nextLine();
            if(sentder.equals("exit")){
                System.exit(0);
            }else {
                System.out.println("nhap noi dung tin nhan:");
                String content = scanner.nextLine();
                Date date = new Date();
                Message message = new Message(sentder , content , date);
                messageList.add(message);
                System.out.println("nhap 'history' de xem lich su, hoac 'filter' de loc tin nhan theo sentder , hoa 'date' de loc theo ngay");
                String input = scanner.nextLine();
                switch (input){
                    case "history":
                        System.out.println("lich su doan chat: ");
                        System.out.println("[ " + date + " ]" + sentder + " : "+ content);
                        System.out.println();
                        break;
                    case "filter":
                        System.out.println("moi nhap vao ten nguoi gui: ");
                        String filterSender = scanner.nextLine();
                        if(sentder.equals(filterSender)){
                            System.out.println("tin nhan tu : " + filterSender);
                            System.out.println("[ " + date + " ]" + filterSender + " : "+ content);
                        }
                        break;
                    case "date":
                        System.out.println("vui long nhap ngay thang de kiem tra: (yyyy-MM-dd");
                        String  date1 = scanner.nextLine();
                        String dateString = date1.formatted(DateTimeFormatter.ISO_DATE_TIME);
                        if(date.equals(dateString)){
                            System.out.println("tin nhan trong ngay : " + date1);
                            System.out.println("[ " + date + " ]" + sentder + " : "+ content);
                        }
                        break;
                    default:
                        System.out.println("vui long nhap 'history' , 'filter' , 'date' de tiep tuc,,,");
                        break;
                }
            }
        }while (true);
    }
}

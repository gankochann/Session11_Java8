package TSU_JV250211_MD03_Session10_Ex06;

import TSU_JV250211_MD03_Session10_Ex03.Message;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMassage {
    private static List<Message> messageList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("nhap ten nguoi gui (nhan exit de thoat)");
            String sentder = scanner.nextLine();
            if(sentder.equals("exit")){
                System.exit(0);
            }
            else {
                System.out.println("nhap noi dung tin nhan:");
                String content = scanner.nextLine();
                LocalDate date = LocalDate.now();
                Message message = new Message(sentder , content , date);
                messageList.add(message);
                System.out.println("nhap 'history' de xem lich su, hoac 'filter' de loc tin nhan theo sentder , hoa 'date' de loc theo ngay");
                String input = scanner.nextLine();

                switch (input){
                    case "history":
                        System.out.println("lich su doan chat: ");
                        if(messageList.isEmpty()){
                            System.err.println("chua co lich su chat,,");
                        }else {
                            messageList.forEach(System.out::println);
                        }
                        break;
                    case "filter":
                        System.out.println("moi nhap vao ten nguoi gui: ");
                        String filterSender = scanner.nextLine();
                        List<Message> filterList = messageList.stream().filter(m -> m.getSender().equalsIgnoreCase(filterSender)).toList();
                        if(filterList.isEmpty()){
                            System.err.println("khong co tin nhan phu hop voi ten nguoi gui");
                        }else {
                            for(Message m : filterList){
                                System.out.println("[ " + m.getTimestamp() + " ]" + m.getSender() + " : "+ m.getContent());
                            }
                        }
                        break;
                    case "date":
                        System.out.println("moi nhap vao ngay thang nam can tim (dd-MM-yyyy)");
                        String dateSender = scanner.nextLine();
//                        String dateString = dateSender.formatted(DateTimeFormatter.ISO_DATE_TIME);
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                        List<Message> dateList = messageList.stream().filter(m -> m.getTimestamp().format(formatter).equals(dateSender)).toList();
                        if(dateList.isEmpty()){
                            System.err.println("chua co lich su chat phu hop,,,");
                        }else {
                            for (Message m : dateList){
                                System.out.println("[ " + m.getTimestamp() + " ]" + m.getSender() + " : "+ m.getContent());
                            }
                        }

                }
            }
        }while (true);
    }

}

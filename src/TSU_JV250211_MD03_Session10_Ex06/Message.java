package TSU_JV250211_MD03_Session10_Ex06;

import java.time.LocalDate;
import java.util.Scanner;

public class Message {
    private String sender;
    private String content;
    private LocalDate timestamp;

    public Message() {
    }

    public Message(String sender, String content, LocalDate timestamp) {
        this.sender = sender;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public void inputData(Scanner scanner){
        this.sender = scanner.nextLine();
        this.content = scanner.nextLine();
        this.timestamp = LocalDate.now();
    }
    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

}

import java.time.LocalDateTime;

public class Notification {
    
    private int notifID;
    private String content;
    private LocalDateTime timestamp;

    public Notification(int notifID, String content, LocalDateTime timestamp){

        this.notifID = notifID;
        this.content = content;
        this.timestamp = timestamp;
    }

    public int getNotifID() {
        return this.notifID;
    }

    public void setNotifID(int notifID) {
        this.notifID = notifID;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    

}

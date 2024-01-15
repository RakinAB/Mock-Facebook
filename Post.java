import java.rmi.server.LoaderHandler;
import java.time.LocalDateTime;

public class Post {
    
    private int postID;
    private String content;
    private LocalDateTime timestamp;
    private User author;

    public Post(int postID, String content, LocalDateTime timestamp, User author){

        this.postID=postID;
        this.content=content;
        this.timestamp=timestamp;
        this.author=author;

    }

    public int getPostID() {
        return this.postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
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

    public User getAuthor() {
        return this.author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}

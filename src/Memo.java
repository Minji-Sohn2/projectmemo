

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Memo {

    static int cnt = 1;
    int id;
    private String name;
    final int password;
    String post;
    String date;

    public Memo(String name, int password, String post) {
        this.id = cnt;
        this.name = name;
        this.password = password;
        this.post = post;
        this.date = setDate();
    }

    public String getDate() {
        return this.date;
    }

    public static String setDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd h:mm:ss");
        return dateTimeFormatter.format(LocalDateTime.now());
    }

    public void editDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
    public void setId(int id){
        this.id = id;
    }

}

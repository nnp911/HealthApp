//import java.util.*;
public class User{
    private Long id; //身份证
    private String phone; //unique +86 only
    private String username;
    private String password;

    public User(Long id, String phone, String username, String password){
        this.id = id;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username);
    }

}
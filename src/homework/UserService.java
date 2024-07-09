package homework;

public class UserService {
    private final User user;

    public UserService(User user){
        this.user = user;
    }

    public void save(){
        System.out.println("Save user: " + user.getName());
    }
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }

}

import java.util.*;
interface Service {
    default String getWelcome() {
        return "Welcome, Guest!";
    }
    Optional<String> getUser(String name);
}
class UserService implements Service {
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name)
                .map(n -> "Welcome, " + n + "!"); 
    }
}

public class User {
    public static void main(String[] args) {
        UserService userService = new UserService();
        String name1 = "Alice";
        Optional<String> Message1 = userService.getUser(name1);
        System.out.println(Message1.orElse(userService.getWelcome()));
        String name2 = null;
        Optional<String> Message2 = userService.getUser(name2);
        System.out.println(Message2.orElse(userService.getWelcome()));
    }
}
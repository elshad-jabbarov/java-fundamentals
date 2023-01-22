package staticFactory;

public class Main {
    public static void main(String[] args) {
        User user = User.createWithDefaultCountry("John", "john@domain.com");
        System.out.println(user.getCountry());
    }
}

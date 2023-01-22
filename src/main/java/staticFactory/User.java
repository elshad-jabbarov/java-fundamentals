package staticFactory;

public class User {
    private final String name;
    private final String email;
    private final String country;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public User(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    /*
    If we initialize the field with a default value,
    we'd have to refactor the constructor too, hence making the design more rigid.
     */

    public static User createWithDefaultCountry(String name, String email) {
        return new User(name, email, "Argentina");
    }

}

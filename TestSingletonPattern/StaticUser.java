package TestSingletonPattern;

public class StaticUser {

    private static int number ;
    private String name;

    public StaticUser() {
    }

    public StaticUser(String name) {
        this.name = name;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        StaticUser.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

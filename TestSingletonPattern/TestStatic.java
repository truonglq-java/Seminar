package TestSingletonPattern;

public class TestStatic {

    public static void main(String[] args) {
        StaticUser staticUser = new StaticUser();
        StaticUser.setNumber(10);
        System.out.println(StaticUser.getNumber());
    }

}

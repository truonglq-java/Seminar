package TestSingletonPattern.Demo;

public class MainSingletonPattern {

    public static void main(String[] args) {


        ManageProcess manageProcess = ManageProcess.getInstance();

        manageProcess.runProcessA();
        manageProcess.runProcessX();
        manageProcess.runProcessB();
        manageProcess.endProcessA();
        manageProcess.endProcessB();
        manageProcess.runProcessX();
        manageProcess.runProcessA();


    }
}

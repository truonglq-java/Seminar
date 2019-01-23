package TestSingletonPattern.DemoProcess;

public class MainSingletonPattern {

    public static void main(String[] args) {

        Process processA = new Process(101,1,"A");
        Process processB = new Process(102,1,"B");
        Process processX = new Process(103,2,"X");
        ManageProcess manageProcess = ManageProcess.getInstance();

        manageProcess.runProcess(processA);
        manageProcess.runProcess(processA);
        manageProcess.runProcess(processB);
        manageProcess.runProcess(processX);
        manageProcess.printProcess();
        manageProcess.endProcess(processA);
        manageProcess.runProcess(processB);
        manageProcess.runProcess(processA);
        manageProcess.printProcess();






    }
}

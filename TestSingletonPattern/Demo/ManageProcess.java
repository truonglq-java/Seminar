package TestSingletonPattern.Demo;

public class ManageProcess {
    // nhom 1
    private boolean processA = false;
    private boolean processB = false;
    // nhom 2
    private boolean processX = false;


    private static ManageProcess instance;

    private ManageProcess(){}


    public static synchronized ManageProcess getInstance(){
        if(instance == null){
            instance = new ManageProcess();
        }
        return instance;
    }

    public void runProcessA(){
        if(processA == false && processX == false){
            processA = true;
            System.out.println(" Process A Start !");
        }else {
            System.out.println("khong the chay process A");
        }


    }

    public void endProcessA(){
        processA = false;
        System.out.println(" Process A END !!");
    }

    public void runProcessB(){
        if(processB == false && processX == false){
            processB = true;
            System.out.println(" Process B Start !");
        } else {
            System.out.println("khong the chay process B");
        }

    }

    public void endProcessB(){
        processB = false;
        System.out.println(" Process B END !!");
    }

    public void runProcessX(){
        if(processA == false && processB == false && processX == false){
            processX = true;
            System.out.println(" Process X Start !");
        } else {
            System.out.println("khong the chay process X");
        }

    }

    public void endProcessX(){
        processX = false;
        System.out.println(" Process C END !!");
    }









}

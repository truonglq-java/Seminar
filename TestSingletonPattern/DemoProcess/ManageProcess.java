package TestSingletonPattern.DemoProcess;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ManageProcess {
    private List<Process> listProcessRunning = new ArrayList<>();


    private static ManageProcess instance;

    private ManageProcess(){}


    public static synchronized ManageProcess getInstance(){
        if(instance == null){
            instance = new ManageProcess();
        }
        return instance;
    }

    public synchronized void runProcess(Process processStart){
        if(processStart == null){
            System.out.println("Data invalid !!!");
        }
        boolean checkRun = checkRunning(processStart,this.listProcessRunning);
        if(checkRun){
            this.listProcessRunning.add(processStart);
            System.out.println("Process "+processStart.getName()+" Running.");
        }else {
            System.out.println("Process "+processStart.getName()+" can't Running cause hava process same type "+processStart.getType()+" is running !");
        }

    }

    public void endProcess(Process processEnd){
        if(processEnd == null){
            System.out.println("Data invalid !!!");
        }else {
            int idProcess = processEnd.getId();
            Process processById = this.listProcessRunning.stream().filter(process -> process.getId() == idProcess).findFirst().orElse(null);
            if(processById == null){
                System.out.println("Data invalid !!!");
            }else {
                this.listProcessRunning.remove(processById);
                System.out.println("Process "+processEnd.getName()+" END.");
            }

        }

    }

    public void printProcess(){
        this.listProcessRunning.forEach(item->{
            System.out.println("*** Process "+item.getName()+" is running with TYPE "+item.getType());
        });
    }



    public static boolean checkRunning(Process process,List<Process> processList){
        int typeProcess;
        if(process == null){
            return false;
        }else if (processList == null || CollectionUtils.isEmpty(processList))
        {
            return true;
        }
        typeProcess = process.getType();
        boolean exist = processList.stream().anyMatch(item -> item.getType() == typeProcess);
        return !exist;

    }

}

package lesson6;

public class Accountant extends Employee{

    public Accountant(String workerName, int workerId, String workerBirth, String workerAddress) {
        super(workerName, workerId, "accountant", workerBirth, 5000, workerAddress);
    }

public void openNewAccount (String workerName){
    System.out.println(String.format("The accountant %s opened new account", workerName));
}
    public void closeExistAccount (String workerName){
        System.out.println(String.format("The accountant %s closed exist account", workerName));
    }
    public void createReport (String workerName){
        System.out.println(String.format("Report created by %s", workerName));
    }
}

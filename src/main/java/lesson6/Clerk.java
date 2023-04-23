package lesson6;

public class Clerk extends Employee {
    public Clerk(String workerName, int workerId, String workerBirth, String workerAddress) {
        super(workerName, workerId, "clerk", workerBirth, 3000, workerAddress);
    }

    public void callToCustomer (String workerName){
        System.out.println(String.format("Clerk %s called to the customer", workerName));
    }

    public void answerIncomingCalls (String workerName){
        System.out.println(String.format("Clerk %s answer incoming call", workerName));
    }

}

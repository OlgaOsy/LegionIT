package lesson6;

public class Manager extends Employee{
    public Manager(String workerName, int workerId, String workerBirth, String workerAddress) {
        super(workerName, workerId, "manager", workerBirth, 10000, workerAddress);
    }
        public void hireEmployee(String workerName){
            System.out.println(String.format("Manager %s hired new employee", workerName));
        }

        public void fireEmployee(String workerName){
            System.out.println(String.format("Manager %s fired old employee", workerName));
        }

}

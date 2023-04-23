package lesson6;

public abstract class Employee {
    String name;
    int id;
    String title;
    String dateOfBirth;
    double salary;
    String address;

    public Employee(String workerName, int workerId, String workerTitle, String workerBirth, double workerSalary, String workerAddress) {
        this.name = workerName;
        this.id = workerId;
        this.title = workerTitle;
        this.dateOfBirth = workerBirth;
        this.salary = workerSalary;
        this.address = workerAddress;
    }

    public void receiveSalary(){
        System.out.println( "Employee received salary");

    }

    public String getName() {
        return name;
    }

    public String setName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public String toString(){
        String workerInformation = String.format("Name: %s, ID: %d, title: %s, Date of Birth: %s, Salary: %f, address: %s", name, id, title, dateOfBirth, salary, address);
    return workerInformation;
    }

}

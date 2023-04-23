package lesson6;

public class MainBankEmployees {
    public static void main(String[] args) {
        Manager manager = new Manager("Olga Osypenko", 1, "03.23.1989", "Poltava");
        Accountant accountant1 = new Accountant("Alex Root", 2, "28.04.1974", "Seattle");
        Accountant accountant2 = new Accountant("John Flat", 3, "15.05.1999", "Dnipro");
        Accountant accountant3 = new Accountant("Sam Adam", 4, "03.05.2004", "Sacramento");
        Accountant accountant4 = new Accountant("Katy Baker", 5, "19.10.2006", "Sumy");
        Accountant accountant5 = new Accountant("Tom Rich", 6, "07.09.1985", "Barrie");
        Clerk clerk1 = new Clerk("Garry Flow", 7, "02.01.1993", "Kyiv");
        Clerk clerk2 = new Clerk("Tanya Novak", 8, "11.12.1972", "Portland");
        Clerk clerk3 = new Clerk("Roy Brown", 9, "01.08.1994", "Madrid");

        System.out.println(manager.toString());
        System.out.println(accountant1.toString());
        System.out.println(accountant2.toString());
        System.out.println(accountant3.toString());
        System.out.println(accountant4.toString());
        System.out.println(accountant5.toString());
        System.out.println(clerk1.toString());
        System.out.println(clerk2.toString());
        System.out.println(clerk3.toString());
    }
}



package Lab4;
import java.util.Scanner;

public class anagajatMain {
    public static void main(String[] args) {
    int N=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numarul de angajati:");
        N= scanner.nextInt();
        angajat[] employees =new angajat[N];

        for(int i=0;i<N;i++){
            System.out.println("Angajatul" + i +" : ");
            employees[i]=new angajat();
            scanner.nextLine();
            System.out.println("numele angajatului:");
            //scanner.nextLine();
            System.out.println("Email-ul angajatului: ");
            employees[i].setEmail(scanner.nextLine());
            System.out.println("Introdu hourrate-ul:");
            employees[i].setHourRate(scanner.nextInt());
            System.out.println("Introdu capacity:");
            employees[i].setCapacity(scanner.nextInt());
            System.out.println("Introdu freedays:");
            employees[i].setFreeDays(scanner.nextInt());

        }
        for (int i=0; i<N; i++){
            System.out.println(employees[i].getName() + " are salariul lunar de " + employees[i].calculateMonthlyIncome()+ " " + employees[i].calculateDailyIncome());
        }
    }
}

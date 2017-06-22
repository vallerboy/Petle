import java.util.Scanner;

/**
 * Created by Lenovo on 22.06.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        int secretNumber = 242;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj! Wpisuj liczby tak długo, aż ją odgadniesz. Powodzenia! :)");
        int answer = 0;
        do {
                System.out.print("Wpisz liczbę: ");
                String textAnswer = scanner.nextLine();

                 if(!textAnswer.matches("[0-9]+")){
                     System.out.println("Wpisałeś złą liczbę!");
                     continue;
                 }

                answer = Integer.valueOf(textAnswer);

                if(answer > secretNumber){
                    System.out.println("Celuj trochę niżej..");
                }else if(answer < secretNumber){
                    System.out.println("Celuj trochę wyżej!");
                }

        }while (answer != secretNumber);
        System.out.println("Wygrałeś!");
    }
}

import java.util.Scanner;

/**
 * Created by Lenovo on 22.06.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        String password = "alamakota";
        Scanner scanner = new Scanner(System.in);

        String passwordTyped = "";

        do{
            System.out.print("Wpisz hasło: ");
            passwordTyped = scanner.nextLine();
        }while (!passwordTyped.equals(password));

        System.out.println("Logowanie przebiegło pomyślnie!");

        // (negacja) ! false -> true, true -> false


    }
}

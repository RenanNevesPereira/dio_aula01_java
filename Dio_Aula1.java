import java.util.Scanner;

public class Dio_Aula1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, informe o seu nome: ");
        String name = scanner.next();

        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();

        System.out.printf("Olá %s sua idade é %s anos", name, age);

        scanner.close();
    }

}

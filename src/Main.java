import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number=0;

        while (number<=100 || number >=200 || number % 3 !=0 ){
            System.out.println("Podaj liczbę");
            number = scanner.nextInt();
            if ( number < 100 ){
                System.out.println("Podana liczba jest za mała");
            }
            if ( number > 200 ){
                System.out.println("Podana liczba jest za duża");
            }
            if ( number % 3 !=0 ){
                System.out.println("Podana liczba nie jest podzielna przez 3");
            }
        }

            System.out.println("Twoja liczba jest ok");
    }
}


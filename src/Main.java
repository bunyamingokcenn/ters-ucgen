import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inputDigits;

        Scanner input= new Scanner(System.in);

        System.out.print("Basamak sayısı giriniz: ");
        inputDigits = input.nextInt();

        for (int i = 1; i<= inputDigits; i++){
            for (int j =0; j <= (inputDigits - i)*2; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
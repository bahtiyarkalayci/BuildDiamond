import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        n = scanner.nextInt();
// üst üçgen oluşumu
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        // alt üçgen oluşumu
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*n)-((2 * i)+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int minimumBreaks = N * M - 1;
        System.out.println(minimumBreaks);
        
        scanner.close();
    }
}

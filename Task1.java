import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stroka = scan.nextLine();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(stroka);
        }
    }
}

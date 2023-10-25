import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int raz = scan.nextInt();
        int litrov = scan.nextInt();
        if (raz <= 0 || litrov <= 0){
            System.out.println("Введены некорректные данные");
            return;
        }

        int vsego = 0;
        for (int i = 1; i <= 16; i++) {
            vsego += raz * litrov;
            System.out.println("K " + i + " неделе будет выпито " + vsego + " литров жидкости");
        }
        if(vsego < 120){
            System.out.println("К сожалению, студент не принят в клуб");
        } else {
            System.out.println("Студент принят в IT-клуб");
        }
    }
}

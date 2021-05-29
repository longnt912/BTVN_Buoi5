import java.util.Scanner;

public class Rabbits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so thang: ");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.println(" " + i + " Tong so tho sinh ra tren thang " + f(i));
        }

    }

    public static int f(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return f(x - 1) + f(x - 2);
        }
    }

}

import java.util.Scanner;

public class Rabbits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so thang: ");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.println(" Thang " + i + " Tong so cap tho sinh ra tren thang " + f(i) + " cap");
        }

    }

    public static int f(int x) {
        if (x ==1 || x==2) {
            return 1;
        } else {
            return f(x - 1) + f(x - 2);
        }
    }

}

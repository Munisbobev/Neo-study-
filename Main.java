import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

        int a = scanner.nextInt();

        String res = "";

        while (a>16) {
            int temp = a % 16;
            res = digits[temp] + res;
            a /= 16;
        }

        res = digits[a] + res;



        System.out.println(res);

    }


}
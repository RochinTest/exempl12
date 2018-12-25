import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = 0, n = 2345,p=0;
        m1:
        {
            for (int i = 0; i<n; i++) {
                System.out.println("Введите пароль вида ****");
                if (sc.hasNextInt())
                    m = sc.nextInt();
                n = 2345;
                if (m != n) System.out.println("Пароль не верный");
                else break m1;
            }}

        System.out.println("входите");


    }
}

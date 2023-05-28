import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x = in.nextInt();
        double result = 0.0;
        if (x < 1) {
            for(int i = 0; i <= N; ++i) {
                result = result + Math.pow((double)x, (double)(2 * x + 1)) / 2.0 * (double)i + 1.0;
            }

            System.out.println(2.0 * result);
        } else {
            System.out.println("ОШИБКА");
        }

    }
}

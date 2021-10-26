import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a, b;
        int sum;
        Scanner in = new Scanner(System.in);

        a = in.nextInt();
        b = in.nextInt();

        sum = a+b;

        System.out.println("Sum "+sum);
    }
}
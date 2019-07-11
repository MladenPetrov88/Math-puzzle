import java.util.Scanner;

public class MathPuzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        boolean flag1 = false;
        boolean flag2 = false;
        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 30; j++) {
                for (int k = 1; k <= 30; k++) {
                    if (i < j && j < k && i + j + k == num) {
                        flag1 = true;
                        int total = i + j + k;
                        System.out.printf("%d + %d + %d = %d%n", i, j, k, total);
                    } else if (i > j && j > k && i * j * k == num) {
                        flag2 = true;
                        int mult = i * j * k;
                        System.out.printf("%d * %d * %d = %d%n", i, j, k,mult);
                    }

                }
            }

        }
        if (!flag1  && !flag2) {
            System.out.println("No!");
        }
    }
}
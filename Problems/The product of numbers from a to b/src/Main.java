import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long sum = a;
        for (int i = a; i < b - 1; i++) {
            sum = sum * (i + 1);
        }
        System.out.print(sum);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int food = days * scanner.nextInt();
        int flight = scanner.nextInt() * 2;
        int sleep = (days - 1) * scanner.nextInt();
        System.out.println(food + flight + sleep);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exp = scanner.nextInt();
        int i = 1;
        while (i * i <= exp) {
            System.out.println(i * i);
            i++;
        }
    }
}
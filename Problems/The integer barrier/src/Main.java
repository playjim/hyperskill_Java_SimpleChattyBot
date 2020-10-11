import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int sum = 0;
        while (true) {
            numbers = scanner.nextInt();
            if (numbers == 0 && sum < 1000) {
                System.out.println(sum);
                break;
            } else if (numbers == 0 && sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            } else if (sum < 1000) {
                sum = sum + numbers;
            }
        }
    }
}
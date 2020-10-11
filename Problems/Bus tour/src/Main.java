import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int countBridges = scanner.nextInt();
        int i = 0;
        while (true) {
            i++;
            if (scanner.nextInt() <= height) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
            if (i == countBridges) {
                System.out.println("Will not crash");
                break;
            }
        }
    }
}
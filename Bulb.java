import java.util.*;

public class Bulb {

    public static int flipLights(int n, int presses) {

        if (presses == 0) return 1;

        if (n == 1) return 2;

        if (n == 2) {
            if (presses == 1) return 3;
            return 4;
        }

        if (presses == 1) return 4;
        if (presses == 2) return 7;

        return 8;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter presses: ");
        int presses = sc.nextInt();

        int result = flipLights(n, presses);

        System.out.println("Different possible states: " + result);

        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < n; i += 2) {
                String pair = s.substring(i, i + 2);

                if (pair.equals("00")) result.append("A");
                else if (pair.equals("01")) result.append("T");
                else if (pair.equals("10")) result.append("C");
                else if (pair.equals("11")) result.append("G");
            }

            System.out.println(result.toString());
        }

        scanner.close();
    }
}
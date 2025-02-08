import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static int solve(int n, int[] snowflakes) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int maxUniqueSnowflakes = 0;
        TreeSet<Integer> uniqueSnowflakes = new TreeSet<Integer>();
        for (int snowflake : snowflakes) {
            if (!uniqueSnowflakes.contains(snowflake)) {
                uniqueSnowflakes.add(snowflake);
            } else {
                maxUniqueSnowflakes = Math.max(maxUniqueSnowflakes, uniqueSnowflakes.size());
                uniqueSnowflakes.clear();
                uniqueSnowflakes.add(snowflake);
            }
        }
        maxUniqueSnowflakes = Math.max(maxUniqueSnowflakes, uniqueSnowflakes.size());

        return maxUniqueSnowflakes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while (cases-- > 0) {
            int n = scanner.nextInt();
            int[] snowFlakes = new int[n];

            for (int i = 0; i < n; i++) {
                snowFlakes[i] = scanner.nextInt();
            }

            int result = solve(n, snowFlakes);

            System.out.println(result);
        }

        scanner.close();
    }
}

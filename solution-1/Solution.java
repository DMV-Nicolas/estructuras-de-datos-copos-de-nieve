import java.util.TreeSet;

public class Solution {
    int n;
    int[] snowflakes;
    int maxUniqueSnowflakes;

    public Solution(int n, int[] snowflakes) {
        this.n = n;
        this.snowflakes = snowflakes;
    }

    public int solve() {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int maxUniqueSnowflakes = 1;
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
}
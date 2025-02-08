
public class TestCase {
    int n;
    int[] snowflakes;
    int maxUniqueSnowflakes;

    public TestCase(int[] snowflakes, int maxUniqueSnowflakes) {
        this.n = snowflakes.length;
        this.snowflakes = snowflakes;
        this.maxUniqueSnowflakes = maxUniqueSnowflakes;
    }
}
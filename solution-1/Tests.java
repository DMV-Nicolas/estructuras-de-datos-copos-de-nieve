public class Tests {
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        TestCase[] testCases = {
                new TestCase(new int[] { 1, 2, 3, 2, 1 }, 3),
                new TestCase(new int[] { 5, 6, 7, 8, 7, 9 }, 4),
                new TestCase(new int[] { 10, 10, 10, 10 }, 1),
                new TestCase(new int[] { 2, 2, 3, 3, 4, 4, 5 }, 2),
                new TestCase(new int[] { 1, 2, 3, 4, 5, 1, 2, 3 }, 5),
                new TestCase(new int[] { 100, 100, 200 }, 2),
                new TestCase(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 2, 10 }, 8),
                new TestCase(new int[] { 2, 3, 2, 3, 4, 2 }, 3),
        };

        for (TestCase testCase : testCases) {
            Solution solution = new Solution(testCase.n, testCase.snowflakes);
            int result = solution.solve();
            if (result != testCase.maxUniqueSnowflakes) {
                System.out.print("Test case failed: ");
                printArray(testCase.snowflakes);
                System.out.println("Expected: " + testCase.maxUniqueSnowflakes);
                System.out.println("Actual: " + result);
                System.out.println();
            } else {
                System.out.print("Test case passed: ");
                printArray(testCase.snowflakes);
            }
        }
    }
}
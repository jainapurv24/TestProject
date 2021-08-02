import java.io.*;

public class CheeseBlocks {
     
    // Function to calculate the maximum amount of cheese that mouse eat
    static int maxAmountOfCheese(int elements[], int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return elements[0];
        if (n == 2)
            return Math.max(elements[0], elements[1]);
        
        // dp[i] represent the maximum amount of cheese 
        int[] dp = new int[n];


        dp[0] = elements[0];
        dp[1] = Math.max(elements[0], elements[1]);
        
        // Fill remaining positions
        for (int i = 2; i < n; i++)
            dp[i] = Math.max(elements[i] + dp[i - 2], dp[i - 1]);

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int elements[] = {2, 6, 8, 5, 10, 100, 10, 5, 3, 1, 2, 3};

        int n = elements.length;
        System.out.println("Maximum amount of cheese : " + maxAmountOfCheese(elements, n));
    }
}


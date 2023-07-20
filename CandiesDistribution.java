import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandiesDistribution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        printMessage("Inside the kidswithcandle function",23);
        // Find the maximum number of candies among all kids
        printMessage("Find the maximum number of candies among all kids",120);
        int maxCandies = candies[0];
        for (int candy : candies) {
            printMessage("checking for max....",89);
            maxCandies = Math.max(maxCandies, candy);
            printMessage("....",78);
        }

        // Initialize the result list

        List<Boolean> result = new ArrayList<>();

        // Check each kid if they can have the greatest number of candies
        printMessage("Check each kid if they can have the greatest number of candies",78);
        for (int kidCandies : candies) {
            result.add(kidCandies + extraCandies >= maxCandies);
        }

        return result;
    }

    public static void main(String[] args) {
        printMessage(">>>>>>>>>          problem statement      <<<<<<<<<<<",12);
        printMessage("There are n kids with candies. You are given an integer array candies,\n where each candies[i] represents the number of candies the ith kid has,\n and an integer extraCandies,\n denoting the number of extra candies that you have.\n" +
                "\n" +
                "Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.\n" +
                "\n" +
                "Note that multiple kids can have the greatest number of candies.\n" +
                "\n" +
                " ",45);
        Scanner sc=new Scanner(System.in);
        printMessage("Intiating the processing",23);
        printMessage("Defining the array of candles ",29);
        int[] candies = new int[5];
        printMessage("emter the elements in the array",120);
        for (int i=0;i<candies.length;i++){
            printMessage("enter the element:",34);
            candies[i]=sc.nextInt();
        }
        printMessage("Enter the extra candles",45);
        int extraCandies = sc.nextInt();
        printMessage("type casting",45);
        List<Boolean> output = kidsWithCandies(candies, extraCandies);
        printMessage(">>>>> Succeessfully processed <<<<<<",120);
        System.out.println(output);  // Output: [true, true, true, false, true]
    }

    public static void printMessage(String message, int delay) {
        int length = message.length();
        for (int i = 0; i < length; i++) {
            char character = message.charAt(i);
            System.out.print(character);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
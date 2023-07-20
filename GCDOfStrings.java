import java.util.Scanner;

public class GCDOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        printMessage(">> Entered in the gcd string  function...",45);
        printMessage("Calculating length of the strings",45);
        int len1 = str1.length();
        int len2 = str2.length();
        printMessage("Calling the gcd function",45);
        int gcdLength = gcd(len1, len2);
        printMessage("Extracting the substring ",45);
        String x = str1.substring(0, gcdLength);
        printMessage("Checking for the divisblity of string 1 and 2 with the gcd length string ",45);
        if (isDivisible(str1, x) && isDivisible(str2, x)) {
            printMessage("yes!! match found the strings are divisible",45);
            return x;
        } else {
            printMessage("NO!! match not found the strings are not divisible",45);
            return "";
        }
    }

    private static int gcd(int a, int b) {
        printMessage("Inside the gcd funtions",45);
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    private static boolean isDivisible(String str, String x) {
        printMessage("Inside the the divisible function",45);
        int len = str.length();
        int xLen = x.length();
        int repetitions = len / xLen;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repetitions; i++) {
            sb.append(x);
        }
        printMessage("Iteration completed for the best fit of the substring",45);
        return str.equals(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printMessage("### welcome to the GCD substring Solver",45);
        printMessage("Enter the first String ",56);
        String str1 = sc.nextLine();
        printMessage("Enter the Sexond String ",56);
        String str2 = sc.nextLine();
        String result = gcdOfStrings(str1, str2);
        printMessage("Process Completed...\n Output Generated is :\t"+result,120);


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
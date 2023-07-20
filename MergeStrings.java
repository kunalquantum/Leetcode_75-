import java.util.Scanner;

public class MergeStrings {

    public static String merge(String word1, String word2) {
        printMessage("Entering in the alterante merge method... ",67);
        StringBuilder merged = new StringBuilder();
        printMessage("Intialized the object of the stringbuilder class.. ",67);
        int minLen = Math.min(word1.length(), word2.length());
        printMessage("checking for the mininum length of the two strings",56);

        printMessage("for loop for the alternate appending of the characters",89);
        for (int i = 0; i < minLen; i++) {
            merged.append(word1.charAt(i)).append(word2.charAt(i));
        }
        printMessage("Append any remaining characters from the longer string",89);
        printMessage("checking for the string 1 is greater than the string 2 ",78);
        if (word1.length() > word2.length()) {
            printMessage("string 1 is greater than the string  2",89);
            merged.append(word1.substring(minLen));
            printMessage("Merging the substrings",89);

        } else  {
            printMessage("string 1 is greater than the string  2",89);

            merged.append(word2.substring(minLen));
            printMessage("Merging the substrings",89);
        }

        return merged.toString();
    }

    public static void main(String[] args) {

        printMessage("#### Welcome to the string alternating software",60);
        Scanner sc= new Scanner(System.in);

        String word1 = "abc";
        String word2 = "pqr";
            printMessage("enter the String 1",45);
            word1=sc.nextLine();
            printMessage("please enter the string 2 ",67);
            word2=sc.nextLine();



        String output = merge(word1, word2);
        printMessage("Successfully proccced ",120);
        printMessage("########### Result ################",120);
        printMessage(output,200);
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
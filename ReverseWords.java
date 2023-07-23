import java.util.Scanner;

public class ReverseWords {
    public static String reverseWords(String s) {
        print("inside the Reverse word Function",45);
        print("Step 1: Trim leading and trailing spaces",12);
        s = s.trim();

        print("Step 2: Split the input string into words",56);
        String[] words = s.split("\\s+");

        print("Step 3: Reverse the array of words",56);
        reverseArray(words);

        print("Step 4: Join the reversed words into a single string with a single space",56);
        return String.join(" ", words);
    }

    private static void reverseArray(String[] arr) {
        print("inside the Reverse Array Function",45);
        int left = 0;
        int right = arr.length - 1;
        print("swapping...",56);
        while (left < right) {
            String temp = arr[left];
            print("....",56);
            arr[left] = arr[right];
            arr[right] = temp;
            print("....",56);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        print("Enter the sentence to be reversed : ",34);
        String sentence=sc.nextLine();
        String res=reverseWords(sentence);
        System.out.print("Reversed word :"+res);

    }
    static void print(String a,int delay){
        int len=a.length();
        for(int i=0;i<len;i++){
            char vis=a.charAt(i);
            System.out.print(vis);

            try {
                Thread.sleep(delay);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println();
    }
}

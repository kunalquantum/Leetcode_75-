import java.util.Scanner;

public class reverse_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print("problem of reversing only vowel from the suppled string ",45);

        print("Enter the String to t=be reversed",45);
        String s=sc.nextLine();
        print("PRocess initiated...",56);
        String res=rev(s);

        print(">>>>>> PRocess Complete <<<<<<<",45);
        print(res,45);


    }
    static String rev(String s){
        print("inside the reversing function ",45);
        print("Converting the string into char array",45);
        print("converting the char into char list",56);

        char[] chars = s.toCharArray();
        print("initiating the left(start) and the right(end) pointer",45);

        int left = 0;
        int right = s.length() - 1;
        print("checking the weather the left is smaller than right or not ",45);
        while (left < right) {
            print("upper conditon satisfied",56);
            print("checking for vowel from start",45);
            while (left < right && !isVowel(chars[left])) {
                print("vowel not found"+"at"+left,45);
                left++;
                print("increamented the start",45);
            }
            print("vowel not found from start",34);

            print("checking for vowel from end",45);
            while (left < right && !isVowel(chars[right])) {
                print("vowel not found"+"at"+right,45);
                right--;
                print("decreamented the end",45);
            }
            print("vowel not found from end",34);

            print("Swapping.... ",45);
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            print("swapping complete",34);
            }

        }

        return new String(chars);

    }
    private static boolean isVowel(char ch) {
        print("inside the vowel checker function",56);
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
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

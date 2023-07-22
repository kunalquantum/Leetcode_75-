import java.util.Scanner;

public class can_place_plant {
    public static void main(String[] args) {
        print("started processing...",67);
        print("Defining the scanner object",67);
        Scanner sc=new Scanner(System.in);
        int[] bed=new int[7];
        print("......",56);
        print("Enter the flowers in the bed (in 0's and 1's only)",67);
        for(int i=0;i<7;i++){
            bed[i]= sc.nextInt();
        }
        print("Enter the new flower (in NUmbers ) only",67);
        int newf= sc.nextInt();
        boolean res=find(bed,newf);
        print("We have Successfully Completed the process",67);
        String show;
        if (res==true){
            show="Yes we can place the flower on the flowerbed";

        }
        else{
            show="No we cant place the flower on the flowerbed";
        }
        print(show,67);



    }
    public static boolean find(int[] bed,int newf){
        print("entered in the Find method",67);
        int count = 0;
        int i = 0;

        while (i < bed.length) {
            if (bed[i] == 0) {

                print("Check if the previous and next positions are also empty (or out of bounds)",67);
                boolean prevEmpty = (i == 0 || bed[i - 1] == 0);

                boolean nextEmpty = (i == bed.length - 1 || bed[i + 1] == 0);

                if (prevEmpty && nextEmpty) {
                    bed[i] = 1;
                    count++;
                    print("Plant a flower at the current position ",67);
                }
            }

            if (count >= newf) {
                return true;
            }

            i++;
        }

        return false;

        }






    public static void print(String message,int delay){
        int length=message.length();
        for(int i=0;i<length;i++) {
            char ch = message.charAt(i);
            System.out.print(ch);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

    }
}

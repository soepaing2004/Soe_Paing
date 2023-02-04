import java.util.Arrays;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the index number:");
        int index_nuiumber=s.nextInt();
        int array[]=new int [index_nuiumber];
        System.out.println("Enter the elements:");
        int i=s.nextInt();
        System.out.println(array[i]);
    }
}

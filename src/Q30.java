import java.util.Arrays;
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the index number of array:");
        int index_number=s.nextInt();
        int array[]=new int[index_number];
        System.out.println("Enter the number of element:");
        for (int i=0;i<index_number;i++){
            array[i]=s.nextInt();
        }
        for (int i:array
             ) {
        }
        System.out.println(Arrays.toString(array));
    }
}

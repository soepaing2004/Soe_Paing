import java.util.Arrays;
import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the index number of array:");
        int index_number=s.nextInt();
        int array[]=new int[index_number];
        System.out.println("Enter the number of element:");
        for (int i=array.length-1;i>=0;i--){
            array[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}

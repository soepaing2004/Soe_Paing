import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of series:");
        int series_number=s.nextInt();
        int a=0,b=1,c=0;
        for (int i=0;i<series_number;i++){
            System.out.println(c);
            c=a+b;
            a=b;
            b=c;
        }
    }
}

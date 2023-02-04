public class Q3 {
    public static void main(String[] args) {
        int number[]={23,24,12,78,62};
        int a=0;
        for (int i=0;i<number.length;i++){
            if (a<number[i]){
                a=number[i];
            }
        }
        System.out.println("The largest number is "+a);
    }
}

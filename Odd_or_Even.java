import java.util.*;
public class Odd_or_Even {
    public static void main(String [] sm){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0) System.out.println("Even");
        else System.out.println("Odd");
        sc.close();
    }
}

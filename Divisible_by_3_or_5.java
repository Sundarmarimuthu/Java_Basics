import java.util.*;
public class Divisible_by_3_or_5 {
    public static void main(String[] sm){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0 && n%5==0) System.out.println("The number is divisible by both 3 and 5");
        else if(n%3==0) System.out.println("The number is divisible by 3");
        else if(n%5==0) System.out.println("The number is divisible by 5");
        sc.close();

    }
    
}

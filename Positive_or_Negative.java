import java.util.*;
public class Positive_or_Negative{
    public static void main(String sm){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0) System.out.println("Negative");
        else if(n>0) System.out.println("Positive");
        else System.out.println("zero");
        sc.close();
    }
}
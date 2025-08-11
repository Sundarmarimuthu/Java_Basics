import java.util.*;
public class Largest_of_Three_Numbers {
    public static void main(String [] sm){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1>n2 && n1>n3) System.out.println(n1+" is the greatest element");
        if(n2>n1 && n2>n3) System.out.println(n2+" is the greatest element");
        else System.out.println(n2+" is the greatest element");
        sc.close();

    }
}

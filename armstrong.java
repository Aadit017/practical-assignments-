import java.util.*;
public class armstrong {
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number to be checked ");
        int n=sc.nextInt();
        int length= Integer.parseInt(String.valueOf(String.valueOf(n).length()));
        int temp=n;
        int sum=0;
        while (n>0){ 
            sum+=Math.pow((n%10),length);
            n/=10;            
        }
        System.out.println(sum==temp);        
    }    
}

import java.util.Scanner;
class armstrong{  
public static void main(String[] args)  
{  
 int k=0,a,temp;  
 System.out.print("enter number ");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt(); 
 temp=n;  
 while(n>0)  
 {  
 a=n%10;  
 n=n/10;  
 k=k+(a*a*a);  
 }  
 if(temp==k)  
 System.out.println("\nArmstrong number");   
 else  
 System.out.println("\nNot armstrong number");   
}  
}  
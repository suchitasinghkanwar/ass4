import java.util.Scanner;
 class even{
public static void main(String[] args){
 int num;
 Scanner s = new Scanner(System.in);   
 System.out.print("Enter Number : ");
 num = s.nextInt();
        for(int i = 1; i <= num; i++)
	{
    if(i%2==0)
{
  System.out.println(i);
 }
 }
}
}
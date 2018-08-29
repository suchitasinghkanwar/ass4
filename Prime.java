import java.util.Scanner; 
class Prime {
public static void main(String args[]){
 int n, count, c=0;
 Scanner s = new Scanner(System.in);
 System.out.print("Enter A Value : ");
 n=s.nextInt();
 System.out.println("Prime Numbers up to " + n);
 for (int i = 2; i <= n; i++) {
  count = 2;
 for (int j = 2; j < i; j++) {
 if (i % j == 0)
   count++;
 }
  if (count == 2) 
{
  System.out.print(i + " ");
    }
  }
 }
}
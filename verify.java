import java.util.Scanner;
class verify
{
  public static void main(String args[])
{
int i, n, search, array[];
 
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of elements");
n = sc.nextInt(); 
array = new int[n];
System.out.println("Enter " + n + " integers");
for (i= 0; i < n; i++)
array[i] = sc.nextInt();
System.out.println("enter number to search");
search = sc.nextInt();
for (i = 0; i < n; i++)
{
if (array[i] == search)
{
System.out.println(search + " is present at location " + (i + 1) + ".");
break;
}
}
if (i == n)
System.out.println(search + " isn't present in array.");
  }
}
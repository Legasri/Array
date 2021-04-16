import java.io.*;
import java.util.Scanner;
class Arr
{
public static void main(String args[])
{
int arr[]=new int[10];
int n;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of array elements:");
n=in.nextInt();
System.out.println("Enter the array elements:");
for(int i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
System.out.println(arr[0]==10||arr[n-1]==10);
}
}

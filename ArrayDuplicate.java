import java.io.*;
import java.util.Scanner;
class ArrayDuplicate
{
public static void main(String args[])
{
int a[]={1,2,3,4,4,5,1};
System.out.println("The duplicate elements are:");
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
System.out.print(a[i]+" ");
}
}
}
}
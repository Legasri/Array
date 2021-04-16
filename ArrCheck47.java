import java.io.*;
import java.util.*;
class Arrcheck47
{
public static void main(String args[])
{
int arr[]={4,5,7};
int flag=0;
System.out.println("Original Array:" +Arrays.toString(arr));
for(int j=0;j<arr.length;j++)
{
if(arr[j]==4||arr[j]==7)
flag++;
}
if(flag>0)
System.out.println("True");
}
}
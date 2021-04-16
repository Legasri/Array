import java.io.*;
import java.util.*;
class ArrLargest
{
public static void main(String args[])
{
int arr[]={20,30,40,50,60};
System.out.println("Original Array:" +Arrays.toString(arr));
int max=arr[0];
if(arr[2]>=max&&arr[2]>=arr[4])
max=arr[2];
if(arr[4]>=max&&arr[4]>=arr[2])
max=arr[4];
System.out.println("Larger value between first,last and mid element:"+max);
}
}
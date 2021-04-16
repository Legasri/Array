import java.io.*;
import java.util.*;
class ArrLarge
{
public static void main(String args[])
{
int arr[]={20,30,40};
System.out.println("Original Array:" +Arrays.toString(arr));
int max=arr[0];
if(arr[2]>=max)
max=arr[2];
System.out.println("Larger value between first and last element:"+max);
}
}
import java.io.*;
import java.util.*;
class ArrMultiply
{
public static void main(String args[])
{
int arr1[]={1,3,-5,4};
int arr2[]={1,4,-5,-2};
int result[]=new int[4];
System.out.println("Array1:" +Arrays.toString(arr1));
System.out.println("Array2:" +Arrays.toString(arr2));
for(int i=0;i<arr1.length;i++)
{
result[i]=arr1[i]*arr2[i];
}
System.out.println("Result:" +Arrays.toString(result));
}
}
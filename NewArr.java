import java.io.*;
import java.util.*;
class NewArr
{
public static void main(String args[])
{
int arr1[]={50,-20,0};
int arr2[]={5,-50,10};
System.out.println("Array1: "+Arrays.toString(arr1));
System.out.println("Array2: "+Arrays.toString(arr2));
int newarr[]={arr1[0],arr2[2]};
System.out.println("New Array: "+Arrays.toString(newarr));
}
}
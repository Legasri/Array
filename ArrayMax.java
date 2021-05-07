import java.io.*;
import java.util.*;
class ArrayMax
{
public static void main(String args[])
{
int a[]={1,2,3,7,4,5,6};
int max=a[0];
for(int i=1;i<a.length;i++)
{
if(a[i]>max)
max=a[i];
}
System.out.println(max);
}
}
import java.io.*;
import java.util.*;
class Array2ndMax
{
public static void main(String args[])
{
int temp;
int a[]={45,76,1,3,54,10,2};
for(int i=0;i<a.length-1;i++)
{
for(int j=0;j<a.length-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println(a[a.length-2]);
}
}

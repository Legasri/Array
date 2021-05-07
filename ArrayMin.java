import java.io.*;
import java.util.*;
class ArrayMin
{
public static void main(String args[])
{
int a[]={2,3,7,1,4,5,6};
int min=a[0];
for(int i=1;i<a.length;i++)
{
if(a[i]<min)
min=a[i];
}
System.out.println(min);
}
}
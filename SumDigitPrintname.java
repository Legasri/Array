import java.io.*;
import java.util.*;
class SumDigitPrintname
{
public static void main(String args[])
{
int num,n,rem,sum=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number:");
n=in.nextInt();
num=n;
System.out.println("Original num: "+num);
while(n!=0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println("Sum :"+sum);
String s[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
if(sum<10)
System.out.println("Sum: "+s[sum]);
else if(sum<100)
{
int x=sum/10;
int y=sum-x*10;
System.out.println("Sum in words: "+s[x]+" "+s[y]);
}
else
{
int i=sum/100;
int j=(sum-i*100)/10;
int k=sum-i*100-j*10;
System.out.println("Sum: "+s[i]+" "+s[j]+" "+s[k]);
}

}
}
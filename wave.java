import java.util.*;
class wave{
public static void main(String ags[])
{

Scanner sc=new Scanner(System.in);
int ar[]=new int[20],j,c,i;
for(i=0;i<10;i++)
{
ar[i]=sc.nextInt();
}
for(j=0;j<10;j++)
{
c=ar[j];
ar[j]=ar[j+1];
ar[j+1]=c;
j++;
}
for(i=0;i<10;i++)
{System.out.println(ar[i]);}

}}
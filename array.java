import java.util.*;
class array{
public static void main(String ags[])
{
int i,max=-3569855,sec;
Scanner sc=new Scanner(System.in);
int ar[]=new int[20],j;
for(i=0;i<10;i++)
{
ar[i]=sc.nextInt();
}
sec=max;
for(i=0;i<10;i++)
{

if(ar[i]>max)
{
sec=max;
max=ar[i];
}
else if(ar[i]>max && ar[i]<sec)
{sec=ar[i];}


}

System.out.println(sec);

}


}
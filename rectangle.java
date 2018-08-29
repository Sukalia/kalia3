import java.util.*;
class rectangle
{
Scanner sc=new Scanner(System.in);
double l,b;
public double CalculateArea()
{
l=sc.nextDouble();
b=sc.nextDouble();
double area;
area=l*b;
return area;

}

}
class Constructor{
public static void main(String ags[])
{


rectangle a=new rectangle();
System.out.println(a.CalculateArea());


}


}
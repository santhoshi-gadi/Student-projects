class Rectangle
{
int len,bre,area;
Rectangle(int l,int b)
{
 len =l;
 bre=b;
}
void cal()
{
area=len*bre;
System.out.println("Area="+area);
 }
}
public class Demo
{
public static void main(String [] args)
{
Rectangle r= new Rectangle(3,4);
r.cal();
 }
}
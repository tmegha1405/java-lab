public class Product
{
int pcde;
String  pnme;
double prce;
Product(int pcode,String pname,double price)
{
pcde=pcode;
pnme=pname;
prce=price;
}
public static void main(String args[])
{
Product p1= new Product(111,"book",125.0);
Product p2= new Product(222,"pen",15.5);
Product p3= new Product(333,"bottle",79.7);
if(p1.prce <p2.prce && p1.prce < p3.prce)
{
System.out.println("Price of book is lowest");
}
else if(p2.prce<p1.prce && p2.prce < p3.prce)
{
System.out.println("Price of pen is lowest");
}
else if(p3.prce>p2.prce && p3.prce<p1.prce)
{
System.out.println("Price of bottle is lowest");
}
}
}

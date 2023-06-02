import java.util.Scanner;
    
  public class AreaCalculator {


       public static double squ_area(double side)

        {

           return side*side;

        }

        public static double rect_area(double length,double width )

        {

            return length*width;

        }

        public static double cir_area(double radius)

        {

            return 3.14 *radius*radius;


        }

    

   public static void main(String args[]) {
   
    Scanner sc=new Scanner(System.in);

         
    System.out.println("Enter the side of the square:");

    double side=sc.nextDouble(); 
 
    double squ_area = squ_area(side);
  
    System.out.println("Area of Square : " + squ_area);

 
    System.out.println("Enter the radius of the circle:");

    double radius=sc.nextDouble(); 
 
    double cir_area = cir_area(radius);
  
    System.out.println("Area of Circle : " + cir_area);


 
    System.out.println("Enter the length of the rectangle:");
 
    double length=sc.nextDouble();
     
    System.out.println("Enter the width of the rectangle:");
 
    double width=sc.nextDouble(); 

    double rect_area = rect_area(length,width);
  
    System.out.println("Area of Rectangle : " + rect_area);

   }
 
 }

     
    
     
    

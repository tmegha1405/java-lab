import java.util.Scanner;
public class studentmark {
public static void main(String[] args) {
int n, total = 0;
float percentage;
Scanner s = new Scanner(System.in);
System.out.print("Enter no. of subject:");
n = s.nextInt();
int marks[] = new int[n];
System.out.println("Enter marks out of 100:");
for(int i = 0; i < n; i++)
{
marks[i] = s.nextInt();
if(marks[i]>100)
{
System.out.println("Enter valid marks");
break;
}
else
{
total = total + marks[i];
}
}
percentage = total / n;
System.out.println("Total mark:"+total);
System.out.println("Percentage:"+percentage);
}
}

import java.util.Arrays;
import java.util.Scanner;
public class sort{
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
System.out.println("Input String Value which should be sorted : ");
String inputString = s.nextLine();
char arrayOfCharacters[] = inputString.toCharArray();
Arrays.sort(arrayOfCharacters); 
String sortedString = new String(arrayOfCharacters); 

System.out.println("After Sorting :  " + sortedString);
}
}


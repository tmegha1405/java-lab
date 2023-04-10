import java.util.Arrays;
import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // get the number of strings from the user
        System.out.print("Enter the number of strings: ");
        int n = input.nextInt();
        
        // declare an array of strings with size n
        String[] words = new String[n];
        
        // get the strings from the user and store them in the array
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            words[i] = input.next();
        }

        // sort the array in alphabetical order
        Arrays.sort(words);

        // print the sorted array
        System.out.println("Sorted strings:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

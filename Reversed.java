import java.util.Scanner;

public class Reversed{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String n = sc.nextLine(); 
        String[] parts = n.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
            String part = parts[i];
            String reversedPart = new StringBuilder(part).reverse().toString();
            reversedSentence.append(reversedPart).append(" ");
        }
        String result = reversedSentence.toString().trim();
        System.out.println(result);
            }
}

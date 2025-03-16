// Implement a function to count the number of vowels in a string.
public class VowelCount {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        
        System.out.println("Number of vowels: " + count);
    }
}

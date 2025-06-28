import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  
        sc.nextLine(); 
        
        String[] results = new String[n];  
        
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            results[i] = abbreviate(word);  
        }
        
        for (String result : results) {
            System.out.println(result);  
        }
    }
    
    public static String abbreviate(String word) {
        if (word.length() > 10) {
            
            return word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
        } 
        else {
           
            return word;
        }
    }
}

import java.util.*;
public class Solution {
    public static void utility(int number) {
        if (number < 10) {
            System.out.println("Small");
        } else if (number > 100) {
            System.out.println("Big");
        } else {
           
            System.out.println("Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> tokens = new ArrayList<>();
        while (sc.hasNextInt()) {
            tokens.add(sc.nextInt());
        }
        sc.close();

        if (tokens.isEmpty()) return;

        
        if (tokens.size() == 1) {
            utility(tokens.get(0));
        } else if (tokens.get(0) == tokens.size() - 1) {
            
            for (int i = 1; i < tokens.size(); i++) {
                utility(tokens.get(i));
            }
        } else {
            
            for (int v : tokens) {
                utility(v);
            }
        }
    }
}

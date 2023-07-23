import java.util.*;

public class Single {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Reading the n value from the user
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        
        ArrayList<Integer> nums = new ArrayList<>();
        
        // Reading n integers from the user and adding them to 'nums'
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nums.add(num);
        }
        
        // Creating the HashMap to store the values
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int sock : nums) {
            // If the key is already present, then just increment its count
            map.put(sock, map.getOrDefault(sock, 0) + 1);
        }
        
        // Counting the pairs
        int pairs = 0;
        for (int count : map.values()) {
            pairs += count / 2;
        }
        
        System.out.println("Number of pairs: " + pairs);
        sc.close();
    }
}

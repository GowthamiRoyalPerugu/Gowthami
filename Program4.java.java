package problems;
	import java.util.HashMap;
	import java.util.Map;

	public class MultiplesCount {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
	        
	        // Initialize a HashMap to store the counts of multiples
	        Map<Integer, Integer> counts = new HashMap<>();
	        
	        // Initialize the multiples you want to count
	        int[] multiples = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        
	        // Count multiples in the array
	        for (int multiple : multiples) {
	            int count = 0;
	            for (int number : numbers) {
	                if (number % multiple == 0) {
	                    count++;
	                }
	            }
	            counts.put(multiple, count);
	        }
	        
	        // Print the counts
	        for (int multiple : multiples) {
	            System.out.println(multiple + ": " + counts.get(multiple));
	        }
	    }
	}



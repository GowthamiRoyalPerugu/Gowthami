package problems;
	import java.util.Scanner;
	public class NumberSeries {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a value for 'x': ");
	        int n = scanner.nextInt();
	        scanner.close();

	        if (n < 1) {
	            System.out.println("Input value 'x' must be greater than or equal to 1.");
	            return;
	        }

	        for (int i = 1; i <= n; i++) {
	            int oddNumber = 2 * i - 1;
	            System.out.print(oddNumber);

	            if (i < n) {
	                System.out.print(", ");
	            }
	        }
	    }
	}



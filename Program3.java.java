package problems;
	import java.util.Scanner;
	public class NumberSeries1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a value for 'x': ");
	        int n = scanner.nextInt();
	        scanner.close();

	        if (n < 1) {
	            System.out.println("Input value 'x' must be greater than or equal to 1.");
	            return;
	        }

	        for (int i = 1; i <= n; i += 2) {
	            System.out.print(i);

	            if (i + 2 <= n) {
	                System.out.print(", ");
	            }
	        }
	    }
	}



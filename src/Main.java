import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int n, negatives = 0;
		int[][] matrix;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		matrix = new int[n][n];
			
		for(int i = 0; i < matrix.length; i++) {			
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for(int i = 0; i < matrix.length; i++) {			
			System.out.print(matrix[i][i] + " ");
		}
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] < 0) {
					negatives++;
				}
			}
		}
		System.out.println("\nNegative numbers = " + negatives);

		sc.close();
	}
}

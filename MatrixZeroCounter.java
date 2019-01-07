/*
 * Write a program to count number of cells that holds zero in a sorted m*n matrix
 */

public class MatrixZeroCounter {
	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 0, 0, 0, 0, 1 }, { 0, 0, 0, 1, 1 },
				{ 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };
		System.out.println(findZerosInMatrix(matrix));
	}

	public static int findZerosInMatrix(int[][] matrix) {
		int count = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 0)
					count++;
			}
		}
		return count;
	}
}

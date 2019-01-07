/*
 * Write a program to find total of cells which holds a negative value in a given matrix
 */
public class MatrixNegativeCellValueFinder {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { -3, -2, -1, 1 }, { -2, 2, 3, 4 },
				{ 4, 5, 7, 8 } };
		System.out.println(findNegativeCellValue(matrix));
	}

	public static int findNegativeCellValue(int[][] matrix) {
		int count = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] < 0)
					count++;
			}
		}
		return count;
	}

}

/*
 * Write a program to find the number of cells which have entry equal to a given number x
 */
public class MatrixEntryFinder {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 2, 4, 6, 8 },
				{ 3, 6, 9, 12 }, { 4, 8, 12, 16 } };
		int x = 2;
		System.out.println(findFrequencyOfNumber(x, matrix));
	}

	public static int findFrequencyOfNumber(int x, int[][] matrix) {
		int count = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == x)
					count++;
			}
		}
		return count;
	}

}

/*
 * Write a program to find the maximum element of each row in a matrix
 */
public class EachRowMaxElementFinder {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3, 21 }, { 12, 1, 65, 9 },
				{ 1, 56, 34, 2 } };
		findMaxElementInRow(matrix);
	}

	public static int[] findMaxElementInRow(int[][] matrix) {
		int largestNum = 0;
		int[] resultMatrix = new int[matrix.length];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (largestNum < matrix[row][col]) {
					largestNum = matrix[row][col];
				}
			}
			resultMatrix[row] = largestNum;
			largestNum = 0;
		}
		printMatrix(resultMatrix);
		return resultMatrix;
	}

	public static void printMatrix(int[] resultMatrix) {
		for (int item : resultMatrix) {
			System.out.print(item + "\t");
		}
	}
}

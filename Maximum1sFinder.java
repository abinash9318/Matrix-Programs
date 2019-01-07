/*
 * Write a program to find row having maximum number of 1's in a given matrix 
 */
public class Maximum1sFinder {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 0, 1, 1, 1 }, { 0, 0, 1, 1 },
				{ 1, 0, 0, 0 }, { 1, 1, 1, 1 } };
		System.out.println(findRowOfMax1s(matrix));
	}

	public static int findRowOfMax1s(int[][] matrix) {
		int prevCount = 0, currCount = 0;
		int maxRow = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 1)
					currCount++;
			}
			if (prevCount <= currCount) {
				prevCount = currCount;
				maxRow = row;
				currCount = 0;
			}
		}
		return maxRow;
	}
}

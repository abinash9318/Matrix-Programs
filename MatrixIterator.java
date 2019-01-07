/*
 * Write a program to iterate a matrix
 */
public class MatrixIterator {
	public static void main(String[] args) throws InterruptedException {
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		traverseElements(matrix);
	}

	public static void traverseElements(int[][] arr)
			throws InterruptedException {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				Thread.sleep(1000);
				System.out.print(arr[row][col] + "\t");
			}
			System.out.print("\n");
		}
	}

}

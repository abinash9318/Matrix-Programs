/*
 * Write a program to find all sorted rows in a given matrix
 */
public class MatrixSortedRowsFinder {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3, 4, 5 }, { 4, 3, 1, 2, 6 },
				{ 8, 7, 6, 5, 4 }, { 5, 7, 8, 9, 10 } };
		System.out.println(countSortedRows(matrix));
	}

	public static int countSortedRows(int[][] matrix) {
		int count=0;
		
		for(int row=0;row<matrix.length;row++){
			for(int col=0;col<matrix[row].length;col++){
				if(!(col==matrix[row].length-1)){
					if(!(matrix[row][col]<matrix[row][col+1]))
						break;
				}
			}
			count++;
		}
		return count;
	}

}

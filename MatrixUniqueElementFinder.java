/*
 * Write a program to find unique element in a given matrix
 */

import java.util.*;
import java.util.Map.Entry;

public class MatrixUniqueElementFinder {

	static Map<Integer, Integer> hashmap = new LinkedHashMap<Integer, Integer>();
	static List<Integer> list = new LinkedList<Integer>();

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 10, 15, 30, 2 }, { 2, 3, 5, 30 },
				{ 6, 7, 6, 8 } };
		System.out.println(findUniqueElements(matrix));
	}

	public static List<Integer> findUniqueElements(int[][] matrix) {

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (!hashmap.containsKey(matrix[row][col])) {
					hashmap.put(matrix[row][col], 1);
				} else {
					hashmap.put(matrix[row][col],
							hashmap.get(matrix[row][col]) + 1);
				}
			}
		}

		Set<Entry<Integer, Integer>> entrySet = hashmap.entrySet();

		for (Map.Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() == 1) {
				list.add(entry.getKey());
			}
		}
		return list;
	}
}

/*
 * Try to solve this problem without Collection API
 */

package telran.util;

import java.util.Arrays;

public class ArraysInt {
	//Add a new element in the end of array
	public static int[] addNumber( int[] array, int number) {
		//copyOf
		int[] result = Arrays.copyOf(array, array.length + 1);
		result[array.length]  = number;
		return result;
	}
	//Insert a new element in the end of array, if position is wrong - do nothing
	public static int[] insertNumber( int[] array, int index, int number) {
		
		if ( index < 0 || index > array.length )
			return null;
		
		int[] result = new int[array.length + 1];
		result[index] = number;
		if ( index > 0 )
			System.arraycopy(array, 0, result, 0 , index);
		if ( index < array.length  )
			System.arraycopy(array, index, result, index + 1 , array.length - index);
		return result;
	}
	//Remove  element in the end of array, if position is wrong - do nothing
	public static int[] removeNumber( int[] array, int index) {
		
		if ( index < 0 || index > array.length - 1 )
			return null;
		
		int[] result = new int[array.length -1 ];
		if ( index > 0 )
			System.arraycopy(array, 0, result, 0 , index);
		if ( index < array.length  )
			System.arraycopy(array, index + 1, result, index , array.length - index - 1);
		return result;
	}
	
	//Insert a new number in sorted array keeping it sorted
		public static int[] insertSorted( int[] sortedArray, int number) {
			int indexToInsert = Arrays.binarySearch(sortedArray, number);
			if ( indexToInsert < 0 )
				indexToInsert = -(indexToInsert + 1);
			return insertNumber(sortedArray, indexToInsert, number);
		}
	


}

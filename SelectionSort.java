public class SelectionSort{
	public static void main(String args[]){
		int[] A = {7,4,8,2,5,3,9};
		sort(A);
		show(A); //display the sorted result A
	}

	public static void sort(int[] A){
		int k;
		for(int i = 0; i < A.length; i++){
 			k = i;
			for(int j = i; j < A.length; j++){
				if(A[j] < A[k]){
					k = j;
				}
			}
			swap(i, k, A);
		}
	}

	public static void show(int[] A){
		String strArray = "Empty array";
		if(A.length > 0) {
			strArray = "{" + A[0];
			for (int i = 1; i < A.length; i++) {
				strArray += "," + A[i];
			}
			strArray += "}";
		}
		System.out.println(strArray);
	}

	public static void swap(int index1, int index2, int[] A){
		int temp = A[index1];
		A[index1] = A[index2];
		A[index2] = temp;
	}
}
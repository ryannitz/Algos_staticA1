public class InsertSort{
	public static void main(String args[]){
		int[] A = {7,4,8,2,5,3,9};
		sort(A);
		show(A); //display the sorted result A
	}

	public static void sort(int[] A){
		for (int i = 1; i < A.length; i++) {
			int key = A[i];
			int j = i-1;
			while (j >= 0 && A[j] > key) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = key;
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


}
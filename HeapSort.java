public class HeapSort {

	public static void main(String[] args) {

	HeapSort hs = new HeapSort();
	// int[] A = {8, 7, 5, 9};
	//int[] A = {8, 7, 5, 9, 2, 1, 3};
	// int[] A = {15, 10, 9, 8, 9, 6, 3, 4, 2, 12};
	//int[] A = {89, 65, 32, 48, 53, 17, 27, 24, 13, 27, 41, 35};
	 int[] A = {4, 10, 3, 5, 1};
	// int[] A = {5,4,3,2,1};
	
	System.out.print("Unsorted ");
	for(int x : A)
	System.out.print(x);

	System.out.println();

	hs.hSort(A);

	System.out.print("Heap Sorted - max heap ");
	for(int x : A)
	System.out.print(x + " ");

	// for (int k = A.length - 1; k >= 0; k--) {
	//	int temp = A[0];
	//	A[0] = A[k];
	//	hSort(A[0..k-1);
	//	
	
	//	System.out.print(A[k]);
	
	// }

	
} // end method main

 private void hSort(int[] a) {

	for (int i = 0; i < a.length; i++) {
	 if ( 2*i + 1 < a.length && a[i] < a[2*i + 1]) { // compare with left child
		sift_down(i, a);
	}
	else if ( 2*i + 2 < a.length && a[i] < a[2*i + 2]) { // compare with right child
		sift_down(i, a);
	} else {

	}
	} // end for loop

	System.out.print("After sifting down ");
	for(int x : a)
	System.out.print(x);


	for (int j = a.length - 1; j >= 0; j--) {
	 if (j/2 >= 0 && a[j] > a[j/2]) { // compare with parent
		percolate(j, a);
	} 
	      
	}
	

} // end method hSort


private void percolate(int x, int[] a) {

	
	while (true) {

	if (x == 0) 
	 break;

	System.out.println(" x " + x);

	int p = x/2;

	System.out.println(" p " + p);

	if (a[x] > a[p] ) {
	int temp = a[p];
	a[p] = a[x];
	a[x] = temp;
	
	x = p;
	} // end if

	else
	  break;
	

	}
} // end method percolate

private void sift_down(int x, int[] a) {

	
	while (true) {

	if (2*x + 2 < a.length  && 2*x + 1 < a.length) {
				
		int temp = a[x];
		int m = 2 * x + 2;

		if (a[2 * x + 1] > a[2 * x + 2])
			m = 2 * x + 1;

		a[x] = Math.max(a[2 * x + 1], a[2 * x + 2]);
	
		a[m] = temp;
		x = m;
		
		} // end if
		
	else if (2*x + 2 < a.length) {
		int temp = a[x];
		int m = 2 * x + 2;
		a[x] = a[m];

		a[m] = temp;
		x = m;

} 
else if (2*x + 1 < a.length) {
		int temp = a[x];
		int m = 2 * x + 1;
		a[x] = a[m];

		a[m] = temp;
		x = m;

} 

else
	break;
		
} // end while loop		
	


} // end method sift_down




} // end class HeapSort

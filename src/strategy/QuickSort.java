package strategy;

public class QuickSort implements Strategy {

	public QuickSort() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int[] sortWithStrategy(int[] toSort) {
		System.out.println(this.getClass().getName());
		Strategy.printArray("before",toSort);
		//quickSort(toSort, 0, toSort.length-1);
		quick_sort(toSort, 0, toSort.length-1);
		Strategy.printArray("after",toSort);
		System.out.println("==================================================");
		return toSort;
	}

	@Deprecated
	private void quickSort(int[] array,int start,int end)  {
		System.out.print("start="+start+",end="+end);
		Strategy.printArray("",array);
		
		int temp;

		if (start >= end) {
			return;
		}
		// 大于号非常重要，如果没有，会导致index越界

		if (start == end - 1) {
			// base condition，两个数的比较，必须有

			if (array[start] > array[end]) {

				temp = array[start];

				array[start] = array[end];

				array[end] = temp;

				return;

			} else

				return;

		}

		int pivot = array[start];

		int i = start + 1;

		int j = end;

		while (i < j) {

			while (array[i] <= pivot && i != end) {// 注意=很重要，否则无限循环

				i++;

				if (i == end && array[i] < pivot) {

					// 非常重要，这是极端情况，考虑到如果pivot取的是最大值的情况

					array[start] = array[end];

					array[end] = pivot;

					quickSort(array, start, i - 1);

					return;

				}

			}

			while (array[j] >= pivot && j != start) {

				j--;

			}

			temp = array[j];
			// i,j交换后需要交换回来，例如8(start),0,3,16(j),5(i),18,12,9 i=4,j=3

			array[j] = array[i];

			array[i] = temp;

		}

		temp = array[j];

		array[start] = array[i];

		array[j] = pivot;

		array[i] = temp;

		// System.out.println("j="+j+" start="+start);

		quickSort(array, start, j - 1);

		quickSort(array, j + 1, end);

	}

	private void quick_sort(int arr[], int start, int end)  
	{  
	    if (start < end)  
	    {  
	        //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1  
	        int i = start, j = end, pivot = arr[start];  
	        while (i < j)  
	        {  
	            while(i < j && arr[j] >= pivot) // 从右向左找第一个小于x的数  
	                j--;    
	            if(i < j)   
	                arr[i++] = arr[j];  
	              
	            while(i < j && arr[i] < pivot) // 从左向右找第一个大于等于x的数  
	                i++;    
	            if(i < j)   
	                arr[j--] = arr[i];  
	        }  
	        arr[i] = pivot;  
	        quick_sort(arr, start, i - 1); // 递归调用   
	        quick_sort(arr, i + 1, end);  
	    }  
	}  
	
	
}

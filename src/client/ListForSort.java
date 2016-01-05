package client;

import strategy.Strategy;

public class ListForSort {

	private int[] arrayToSort;

	/**
	 * @param arrayToSort
	 */
	public ListForSort(int[] arrayToSort) {
		super();
		this.arrayToSort = arrayToSort;
	}

	public final int[] getArrayToSort() {
		return arrayToSort;
	}

	public final void setArrayToSort(int[] arrayToSort) {
		this.arrayToSort = arrayToSort;
	}
	
	public int getLength(){
		return arrayToSort.length;
	}
	
	public void sort(Strategy st){
		this.arrayToSort = st.sortWithStrategy(arrayToSort); 
	}

}

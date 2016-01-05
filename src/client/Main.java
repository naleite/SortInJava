package client;

import strategy.InsertSort;
import strategy.QuickSort;
import strategy.Strategy;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int arr[]=new int[10];
		int arr2[]=new int[10]; 
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
			arr2[i]=arr[i];
		}
		
		
		ListForSort list = new ListForSort(arr);
		Strategy st = new QuickSort();
		list.sort(st);
		
		ListForSort list2 = new ListForSort(arr2);
		Strategy st2 = new InsertSort();
		list2.sort(st2);
	}

}
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import strategy.QuickSort;
import strategy.Strategy;
import client.ListForSort;

public class QuickSortTest {

	int[] array;
	//int[] arrayRight;
	ListForSort list;
	Strategy st;
	List<Integer> res= new ArrayList<>();
	@Before
	public void setUp() throws Exception {
		array = TestUtil.getArray();
		 list = new ListForSort(array);
		 st = new QuickSort();
		 
		 for(int i :array){
			 res.add(i);
		 }
		 
	}

	@Test
	public void testSortWithStrategy() {
		for(int i = 0 ; i<array.length;i++){
			Assert.assertTrue(array[i] == res.get(i));
		}
		list.sort(st);
		
		//调用Collections内部的排序函数，实行排序
		Collections.sort(res);
		
		for(int i = 0 ; i<array.length;i++){
			//判断自定义排序和系统排序是否一致
			Assert.assertTrue(array[i] == res.get(i));
		}
		

		
	}

}

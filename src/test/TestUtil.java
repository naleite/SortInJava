package test;

public class TestUtil {

	static volatile int[] array;
	
	private TestUtil() {
	
	}

	public static final int[] getArray() {
		
		
			array = new int[10];
			for(int i=0;i<array.length;i++){
				array[i]=(int)(Math.random()*100);
				
			
		}
		return array;
	}

	
	
	

}

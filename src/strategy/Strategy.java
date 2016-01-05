package strategy;

public interface Strategy {

	int[] sortWithStrategy(int[] toSort);
	
	//void printArray(String prefix,int[] array);
	
	public static void printArray(String prefix, int[] array) {
		System.out.print(prefix+": ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"  ");
		}
		System.out.println();
	}
}

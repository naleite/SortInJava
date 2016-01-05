package strategy;

public class BubbleSort implements Strategy {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int[] sortWithStrategy(int[] toSort) {
		System.out.println(this.getClass().getName());
		Strategy.printArray("before", toSort);
		int n = toSort.length;
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j > i; j--) {
				if(toSort[j]<toSort[j-1]){
					temp = toSort[j];
					toSort[j]=toSort[j-1];
					toSort[j-1]=temp;
				}
				
			}
			
		}
		Strategy.printArray("after", toSort);
		System.out.println("============================================");
		return toSort;
	}

}

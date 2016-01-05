package strategy;

public class InsertSort implements Strategy {

	public InsertSort() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int[] sortWithStrategy(int[] toSort) {
		Strategy.printArray("before", toSort);
		int i,j,temp;
		int n = toSort.length;
		for(i=1;i<n;i++){
			temp = toSort[i];
			j=i-1;
			while(j>=0 && temp<toSort[j]){
				toSort[j+1]=toSort[j];
				j--;
			}
			toSort[j+1]=temp;
		}
		Strategy.printArray("after", toSort);
		return toSort;
	}

	

}

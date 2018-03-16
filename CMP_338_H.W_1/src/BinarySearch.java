

public class BinarySearch extends RunTime implements SearchInterface {

	@Override
	public int search(int[] listOfNumbers, int target) {
		int index = -1;
		long startTime = System.nanoTime();
		
//		Implement your binary search here
		int low = 0;
		int high = listOfNumbers.length - 1;
		
		while(low <= high){
			
			int mid = (low+high)/2;
			
			if (target==listOfNumbers[mid]){
				index = mid;
				break;
			}
			else {
				if(target > listOfNumbers[mid]){
					low = mid+1;
					continue;
				}else{ //the target < mid
					high = mid -1;
					continue;
				}
			}
		}
		
		long endTime = System.nanoTime();
		long runTime = endTime - startTime;
		this.addRuntime(runTime);
		
		return index;
	}

}



public class Driver implements DriverInterface {

	@Override
	public int[] getListOfNumbers() {
		
		int[] listOfNumbers = new int[10000000];
		for (int i = 0; i < listOfNumbers.length; i++) {
			listOfNumbers[i]= i+1;
		}
		return listOfNumbers;
	}

	@Override
	public int[] getTargets() {
		int[] targets = {500, 10000, 
				100000,1000000, 
				5000000,7500000,
				10000000
		};
		
		return targets;
	}

	@Override
	public RunTime runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes) {
		
		LinearSearch c = new LinearSearch();
		
		while(numberOfTimes > 0){
			c.search(listOfNumbers, target);
			numberOfTimes --;
		}
		return c;
	}

	@Override
	public RunTime runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes) {
		
		BinarySearch c = new BinarySearch();
		
		while(numberOfTimes > 0){
			c.search(listOfNumbers, target);
			numberOfTimes--;
		}
		return c;
	}

	public static void main(String[] args) {
		

	}

}

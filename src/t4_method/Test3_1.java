package t4_method;

public class Test3_1 {

	public int hap(int[] su) {
		int hap = 0;
		for(int i=0; i<su.length; i++) {
			hap += su[i];
		}
		return hap;
	}

	int sum(int ... su) {
		int sum = 0;
		for(int i=0; i<su.length; i++) {
			sum += su[i];
		}
		return sum;
	}
	
}

public class euler6{
	public static void main(String[] args){		

		int sum=0, square=0;  //sum of squares
		for(int i=1; i<=100; i++){
			sum+=i*i;
			square+=i;
		}
		square=square*square;
		System.out.printf("difference for sum of squares and squares of sums for 1-100: %d",square-sum); 
	}
}
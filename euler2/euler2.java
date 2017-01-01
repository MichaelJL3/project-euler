public class euler2{
	public static void main(String[] args){
		int i=0; long fib=0; long total=0; //sum of even fibonnaci up to 4000000
		while(fib<=4000000){
			fib=fib(i)[0];
			if(fib%2==0 && fib<=4000000)total+=fib; //even only
			i++;
		}
		System.out.println(total); //final
	}

	public static long[] fib(long n){
		long[]x = new long[2];
		if(n==0 || n==1){x[0]=0; x[1]=1;}
		else{
			long y[]=fib(n-1); 
			x[1]=y[0];
			x[0]=y[0]+y[1];
		}
		return x;
	}
}
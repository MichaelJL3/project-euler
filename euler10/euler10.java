import java.lang.Math;

public class euler10{
	public static void main(String[] args){

		long i=3, sum=2; //sum of primes under 2 million
		boolean prime;
		while(i<2000000){
			prime=true;
			for(int j=1; j<Math.sqrt(i)+1; j++){
				if(i%j==0&&j!=1)prime=false; j++;}
			if(prime)sum+=i;
			i++; i++;
		}
		System.out.println(sum); 
	}
}
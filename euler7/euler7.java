import java.lang.Math;

public class euler7{
	public static void main(String[] args){
		
		int i=3, count=1;  //100001st prime number
		boolean prime;
		while(count<10001){
			prime=true;
			for(int j=1; j<Math.sqrt(i)+1; j++){
				if(i%j==0&&j!=1)prime=false; j++;}
			if(prime)count++; 
			i++; i++;
		}
		System.out.printf("10001th prime number: %d", i-2);
	}
}
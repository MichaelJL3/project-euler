import java.lang.Math;

public class euler3{
	public static void main(String[] args){

		long max=600851475143L;
		long i=(int)Math.sqrt(max);  
		if(i%2==0)i--;
		boolean prime;
		mainloop:
		for(; i>3; i--){
			prime=true;
			for(int j=1; j<Math.sqrt(i)+1; j++){
				if(i%j==0&&j!=1)prime=false; j++;}
			if(prime&&max%i==0)break mainloop; 
			i--; 
		}
		System.out.printf("Largest prime factor is: %d\n\n", i);
	}
}
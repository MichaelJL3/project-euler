public class euler14{
	public static void main(String[] args){
		int count=0, big=0, chain=0, n=1;
		long temp=1;
		while(n<1000000){
			temp=n; count=0;
			while(temp!=1){
				if(temp%2==0)temp/=2;
				else temp=3*temp+1;
				count++;
			}
		if(count>chain){chain=count; big=n;}
		n++;
		}
	System.out.printf("Largest Chain= %s\nStarting Number= %s\n", chain, big);
	}
}

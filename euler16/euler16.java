import java.math.BigInteger;
import java.lang.Math;

public class euler16{
	public static void main(String[] args){
		int num=1000, sum=0;
		BigInteger result=power(num)[1];
		String total = result.toString();
		for(int i=0; i<total.length(); i++){
			sum+=Integer.parseInt(total.substring(i, i+1));
		}
                System.out.printf("2^%d = %s\nSum of Number = %s\n\n",num,total,sum);
	}
	public static BigInteger[] power(int n){
		BigInteger[] mul=new BigInteger[3];
                mul[2]=BigInteger.valueOf(2);
		if(n==1||n==0){
			mul[0]=BigInteger.valueOf(2);
			mul[1]=BigInteger.valueOf(2);
		}
		else{
            if(n%5==0){
                BigInteger[] ans=(power(n/5));
                mul[0]=BigInteger.valueOf(n);
				mul[1]=mul[2].pow(mul[0].intValue());
                mul[2]=mul[1];
            } 
            else{
				BigInteger[] ans=(power(n/2));
                mul[0]=BigInteger.valueOf(n);
				mul[1]=mul[2].pow(mul[0].intValue());
                mul[2]=mul[1];
            }
		}
		return(mul);
	} 
}
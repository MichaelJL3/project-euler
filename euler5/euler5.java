public class euler5{
	public static void main(String[] args){
		
		boolean more=true;
		int num=20;
		while(more){
			if(num%11==0&&num%12==0&&num%13==0&&num%14==0&&num%15==0&&num%16==0&&num%17==0&&num%18==0&&num%19==0)break;
			num+=20;
		}
		System.out.printf("Smallest number evenly divisible by 1-20 is: %d",num);
	}
}
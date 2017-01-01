public class euler4{
	public static void main(String[] args){

		int highest=0, highest2=0; String test="", test2="", test3=""; //highest palindrome within 3 digit product
		mainLoop:
		for(int i=999; i>=100; i--){
			for(int j=999; j>100; j--){
				highest=i*j;
				test=Integer.toString(highest); 
				test2=test.substring(0, test.length()/2); 
				if(test.length()%2!=0)test=test.substring(1);
				for(int x=test2.length(); x>0; x--)test3+=test.substring(test2.length()+x-1, test2.length()+x);
					//System.out.println(test3);
					//System.out.println(test2+" test2 "+j+" "+i);
				if(test3.equals(test2)&&Integer.parseInt(test3)>highest2)
					{highest2=Integer.parseInt(test3); System.out.println(j+" "+i);}
				test3="";
			}
		}
		System.out.printf("highest palindrome = %d",highest); //smallest number evenly divisible
	}
}
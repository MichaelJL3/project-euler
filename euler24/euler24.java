public class euler24{
	public static void main(String[] args){
		String num="1234";
		String temp="1243";
		int count=1, i=num.length()-1;
		while(count<20){
			if(count%2!=0){
				temp=num.substring(0,i-1)+temp.substring(i);
				temp=num.substring(0,i)+temp.substring(i, i+1);
			}
			//else temp=num.substring();
			count++; 
			System.out.println(temp+" "+num);
		}
	}
}
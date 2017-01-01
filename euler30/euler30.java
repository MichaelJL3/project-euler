import java.lang.Math;

public class euler30{
	public static void main(String[] args){		
		int i=2, comp=0, total=0;
		String temp="";
		while(i<300000){
			comp=0;
			temp=Integer.toString(i);
			for(int j=0; j<temp.length(); j++){
				comp+=Math.pow(temp.charAt(j)-48, 5);
			}
			if(i==comp){total+=i; System.out.println(i);}
			i++;
		}
		System.out.println(total);
	}
}
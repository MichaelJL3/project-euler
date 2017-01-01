public class euler9{
	public static void main(String[] args){
		
		int c=0, temp;  //pythagoreon
		mainLoop:
		for(int a=1; a<500; a++){
			for(int b=1; b<500; b++){
				temp=a*a+b*b;
				c=1000-(a+b);
				if(c*c==temp){c=a*b*c; break mainLoop;}
			}
		}
		System.out.println(c);
	}
}
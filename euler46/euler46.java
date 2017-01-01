import java.lang.Math;

public class euler46{
	public static void main(String[] args){
		boolean more=true, comp=true, run=true;
		long num=3, temp=0, count=0;
		mainloop:
		while(run){
			for(int i=1; i<Math.sqrt(num)+1; i++){
				more=true;
				if(num%i==0&&i!=1)break;
				else more=false;
				i++;
			}
			secondloop:
			if(more){
				for(long i=num-2; i>1;){
					comp=false;
					for(int j=1; j<Math.sqrt(i)+1; j++){
						if(i%j==0&&j!=1)comp=true;
						j++; 
					}
					if(!comp){
						temp=(num-i)/2; 
						if(temp%Math.sqrt(temp)==0)break secondloop;
					}
					i-=2;
				}
				if(count==0)break mainloop; 
			}
			num+=2; 
		}
		System.out.printf("Smallest goldbach false odd composite= %s\n", num);
	}
}
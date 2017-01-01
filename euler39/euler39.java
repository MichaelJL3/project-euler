import java.lang.Math;

public class euler39{
	public static void main(String[] args){
		int p=12, big=0, temp=0, count=0, bigP=0;
		while(p<=1000){
			count=0;
			for(int i=1; i<p/2-1; i++){
				for(int j=1; j<i; j++){
					temp=(j*j+i*i);
					if(temp%Math.sqrt(temp)==0&&(j+i+Math.sqrt(temp))==p)count++;
						//System.out.println(count+" "+i+" "+j+" "+temp+" "+p);
				}
			}
			if(count>big){big=count; bigP=p;} 
			p++;
		}
		System.out.println("biggest= "+bigP+" "+big);
	}
}
import java.lang.Math;

public class euler12{
      public static void main(String[] args){
              boolean more=true;
	      long n=1, count=0, temp=1;
	      mainloop:
	      while(more){
		   count=0;
		   for(int i=1; i<Math.sqrt(n); i++){
	      	       if(n%i==0){count++; count++;}
		   }
	      if(count>500)break mainloop;
	      temp++;
	      n+=temp;//System.out.println("n= "+n+" count= "+count);
	      }
	      System.out.println("First triangle number with 500 divisors: "+n);
      }
}

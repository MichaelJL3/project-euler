import java.lang.Math;

public class euler26{
	public static void main(String[] args){		
		double d=2, temp;
		int length=0, big=0;
		String dec="", mid="";
		while(d<99){
			temp=1/d;
			dec=Double.toString(temp);
			dec=dec.substring(2);
			length=0;
			for(int i=1; i<dec.length(); i++){
				if(dec.length()<12)break;
				mid=dec.substring(i);
				if(dec.length()>3&&mid.charAt(i)==mid.charAt(i+1)){length++; break;}
				if(dec.length()>3&&dec.charAt(0)==mid.charAt(i-1)){length++; break;}
				length++;
				if(dec.length()>3&&dec.charAt(i)==mid.charAt(i+1)){length++; break;}
			}
			if(length>big)big=length;
			System.out.println(dec+" "+length);
			d++;
		}
		System.out.println(big);
	}
}
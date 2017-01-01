import java.lang.Math;

public class euler11{
	public static void main(String[] args){

		// greatest product of 4 directionally in grid
		String num= "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08"+
					"49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00"+
					"81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65"+
					"52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91"+
					"22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80"+
					"24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50"+
					"32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70"+
					"67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21"+
					"24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72"+
					"21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95"+
					"78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92"+
					"16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57"+
					"86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58"+
					"19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40"+
					"04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66"+
					"88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69"+
					"04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36"+
					"20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16"+
					"20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54"+
					"01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";
		
		num=num.replaceAll("\\s", "");
		int largest=0, temp=0;
		largest=right(num); 
		temp=down(num);     
		if(largest<temp)largest=temp;
		temp=diag(num);         
		if(largest<temp)largest=temp; 
		temp=lrdiag(num);
		if(largest<temp)largest=temp;
		System.out.println(largest);
	}
	public static int right   (String n){
		int test=0, temp=0; int length=0;
		for(int j=1; j<=20; j++){
			length=n.length()/20*j;
			for(int i=0; i<length-6; i++){
				temp=((n.charAt(i)-48)*10+(n.charAt(i+1)-48))*((n.charAt(i+2)-48)*10+(n.charAt(i+3)-48))
					*((n.charAt(i+4)-48)*10+(n.charAt(i+5)-48))*((n.charAt(i+6)-48)*10+(n.charAt(i+7)-48));
				if(test<temp)test=temp;
				if(temp==96059601)return temp;
				i++;
			}
		}
		return test;
	}
	public static int left   (String n){
		int test=0, temp=0; int length=0;
		for(int j=20; j>=1; j--){
			length=n.length()/20*j;
			for(int i=length-1; i>6; i--){
				temp=((n.charAt(i-1)-48)*10+(n.charAt(i)-48))*((n.charAt(i-3)-48)*10+(n.charAt(i-2)-48))
					*((n.charAt(i-5)-48)*10+(n.charAt(i-4)-48))*((n.charAt(i-7)-48)*10+(n.charAt(i-6)-48));
				if(test<temp)test=temp;
				if(temp==96059601)return temp;
				i--;
			}
		}
		return test;
	}
	public static int up   (String n){
		int test=0, temp=0;
		for(int i=n.length()-1; i>120; i--){
			temp=((n.charAt(i-1)-48)*10+(n.charAt(i)-48))*((n.charAt(i-41)-48)*10+(n.charAt(i-40)-48))
				*((n.charAt(i-81)-48)*10+(n.charAt(i-80)-48))*((n.charAt(i-121)-48)*10+(n.charAt(i-120)-48));
			if(test<temp)test=temp;
			if(temp==96059601)return temp;
			i--;
		}
		return test;
	}
	public static int down   (String n){
		int test=0, temp=0;
		for(int i=0; i<n.length()-120; i++){
			temp=((n.charAt(i)-48)*10+(n.charAt(i+1)-48))*((n.charAt(i+40)-48)*10+(n.charAt(i+41)-48))
				*((n.charAt(i+80)-48)*10+(n.charAt(i+81)-48))*((n.charAt(i+120)-48)*10+(n.charAt(i+121)-48));
			if(test<temp)test=temp;
			if(temp==96059601)return temp;
			i++;
		}
		return test;
	}
	public static int diag   (String n){
		int test=0, temp=0, length=0, count=0;
		for(int j=0; j<17; j++){
			count++;
			length=(n.length()/20)*count;
			for(int i=40*j; i<length-6; i++){
				temp=((n.charAt(i)-48)*10+(n.charAt(i+1)-48))*((n.charAt(i+42)-48)*10+(n.charAt(i+43)-48))
					*((n.charAt(i+84)-48)*10+(n.charAt(i+85)-48))*((n.charAt(i+126)-48)*10+(n.charAt(i+127)-48));
				if(test<temp)test=temp;
				if(temp==96059601)return temp;
				i++;
			}
		}
		return test;
	}
	public static int lrdiag   (String n){
		int test=0, temp=0, length=0, count=20;
		for(int j=20; j>3; j--){
			count--;
			length=(n.length()/20)*count;
			for(int i=length; i<40*j-6; i++){
				temp=((n.charAt(i)-48)*10+(n.charAt(i+1)-48))*((n.charAt(i-38)-48)*10+(n.charAt(i-37)-48))
					*((n.charAt(i-76)-48)*10+(n.charAt(i-75)-48))*((n.charAt(i-114)-48)*10+(n.charAt(i-113)-48));
				if(test<temp)test=temp;
				if(temp==96059601)return temp;
				i++;
			}
		}
		return test;
	}
}          

public class euler51{
	static int count=0;
	public static void main(String[] args){
		int i=56003, m=0, num=0;
		String temp="";
		while(num<7){
			num=0;
			for(int k=0; k<10; k++){
				if(i<100){temp=k+Integer.toString(i).substring(1); m=Integer.parseInt(temp); if(count>num)num=count;}
				if(i>10000){
					//if(k!=0){temp=Integer.toString(i).substring(0,2)+k+Integer.toString(i).substring(3); 
					//m=Integer.parseInt(temp); prime(m); num+=count;}
					temp=Integer.toString(i).substring(0,2)+k+k+Integer.toString(i).substring(4); 
					m=Integer.parseInt(temp); prime(m); num+=count;
					/*temp=Integer.toString(i).substring(0,1)+k+k+Integer.toString(i).substring(3);
					m=Integer.parseInt(temp); prime(m); num+=count;
					temp=Integer.toString(i).substring(0,1)+k+k+k+Integer.toString(i).substring(4); 
					m=Integer.parseInt(temp); prime(m); num+=count;
					temp=Integer.toString(i).substring(0,1)+k+Integer.toString(i).substring(2,3)+k
						+Integer.toString(i).substring(4); 
					m=Integer.parseInt(temp); prime(m); num+=count;*/
				}
			}
			i+=2;
		}	
		System.out.println(i-2);
	}
	public static void prime(int m){
		count=0;
		boolean prime=true;
		for(int j=1; j<Math.sqrt(m)+1; j++){
			if(m%j==0&&j!=1){prime=false; j++;}
		}
		if(prime){count++; System.out.println(m);}
	}
}
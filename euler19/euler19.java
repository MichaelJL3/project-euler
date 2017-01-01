public class euler19{
	public static void main(String[] args){
		int year=1900, days=0, day=1, sun=0, count=0;
		for(; year<2001; year++){
			days=365;
			if(year%4==0)days=366;
			if(year%100==0&&year%400!=0)days=365;
			for(int mon=1; mon<13; mon++){
				if(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12){
					switch(day){
						case 1: day=4; sun+=4; break;
						case 2: day=5; sun+=4; break;
						case 3: day=6; sun+=4; break;
						case 4: day=7; sun+=4; break;
						case 5: day=1; sun+=5; break;
						case 6: day=2; sun+=5; break;
						case 7: day=3; sun+=5; count++; break;
					}
				}
				if(mon==4||mon==9||mon==11||mon==6){
					switch(day){
						case 1: day=3; sun+=4; break;
						case 2: day=4; sun+=4; break;
						case 3: day=5; sun+=4; break;
						case 4: day=6; sun+=4; break;
						case 5: day=7; sun+=4; break;
						case 6: day=1; sun+=5; break;
						case 7: day=2; sun+=5; count++; break;
					}
				}
				if(mon==2){
					if(days==365){
						switch(day){
							case 1: day=1; sun+=4; break;
							case 2: day=2; sun+=4; break;
							case 3: day=3; sun+=4; break;
							case 4: day=4; sun+=4; break;
							case 5: day=5; sun+=4; break;
							case 6: day=6; sun+=4; break;
							case 7: day=7; sun+=4; count++; break;
						}
					}
					if(days==366){
						switch(day){
							case 1: day=2; sun+=4; break;
							case 2: day=3; sun+=4; break;
							case 3: day=4; sun+=4; break;
							case 4: day=5; sun+=4; break;
							case 5: day=6; sun+=4; break;
							case 6: day=7; sun+=4; break;
							case 7: day=1; sun+=5; count++; break;
						}
					}
				}
			}
		}
		System.out.println("Total sundays= "+sun+"\nSundays on the 1st of the month= "+count);
	}
}
public class euler17{
	public static void main(String[] args){
		String total="";
		String[] numbers={"NA", " one ", " two ", " three ", " four ", " five ", " six ",
			" seven ", " eight ", " nine "};
		String[] numbers2={"NA", "NA", " twenty ", " thirty ", " forty ",
			" fifty ", " sixty ", " seventy ", " eighty ", " ninety "};
		String[] numbers3={"NA", " one hundred ", " two hundred ", " three hundred ", 
			" four hundred ", " five hundred ", " six hundred ", " seven hundred ", " eight hundred ", 
			" nine hundred "};
		String[] attach={"NA"," and "," and "," and "," and "," and "," and "," and "," and "," and "};
		for(int k=0; k<10; k++){
			total+=" "+numbers3[k];
			for(int j=0; j<10; j++){
				if(j>1)total+=" "+numbers3[k]+" "+attach[k]+" "+numbers2[j];
					if(j==1){total+=numbers3[k]+" "+attach[k]+" ten " +numbers3[k]+" "+attach[k]+ " eleven " 
						+numbers3[k]+" "+attach[k]+" twelve "
						+numbers3[k]+" "+attach[k]+" thirteen " + numbers3[k]+" "+attach[k]+ " fourteen " 
						+numbers3[k]+" "+attach[k]+ " fifteen " 
						+numbers3[k]+" "+attach[k]+ " sixteen " + numbers3[k]+" "+attach[k]+ " seventeen " 
						+numbers3[k]+" "+attach[k]+ " eighteen " 
						+numbers3[k]+" "+attach[k]+ " nineteen ";}
					if(j!=1)for(int i=1; i<10; i++){
					total+=" "+numbers3[k]+" "+attach[k]+numbers2[j]+" "+numbers[i];
				}
			}
		}
		total+=" one thousand ";
		total=total.replaceAll("NA", "").replaceAll("\\s", "");
		System.out.println(total.length());
	}
}
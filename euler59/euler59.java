import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class euler59{
	static String encrypt="", reveal="";
	static int total=0;
    public static void main(String[] args)throws FileNotFoundException{
        File file=new File("./enter/cipher.txt");
	  	Scanner read=new Scanner(file);
	  	while(read.hasNextLine())encrypt+=read.nextLine();
	  	String pass="";
		mainLoop:
	  	for(int a=97; a<=122; a++){ 
	        for(int j=97; j<=122; j++){  
		   		for(int k=97; k<=122; k++){
		   		total=0;
				reveal=decrypt(a,j,k);
				if(reveal!=""){
					pass=(char)a+""+(char)j+""+(char)k; 
					reveal+="\n\nPASS= "+pass+"\nASCII SUM= "+total; break mainLoop;}
		   		}
	       }
		}System.out.println(reveal);
    }

    public static String decrypt(int a, int b, int c){
    	boolean more=true; String encrypt2=""; int i=0, ascii=0;
		while(i<encrypt.length()-2){
	      		if(encrypt.charAt(i)!=44 && encrypt.charAt(i+1)!=44){
		  			ascii=(Integer.parseInt(encrypt.substring(i, i+2))^a); i+=3;
		  			encrypt2+=(char)ascii+"";}
		  		else
	      			{ascii=(Integer.parseInt(encrypt.substring(i, i+1))^a); i+=2;
	      			encrypt2+=(char)ascii+"";}
	      		total+=ascii; 
	      		if(encrypt.charAt(i)!=44 && encrypt.charAt(i+1)!=44){
		  			ascii=(Integer.parseInt(encrypt.substring(i, i+2))^b); i+=3;
		  			encrypt2+=(char)ascii+"";}
		  		else
	      			{ascii=(Integer.parseInt(encrypt.substring(i, i+1))^b); i+=2;
	      			encrypt2+=(char)ascii+"";}
	      		total+=ascii; 
	      		if(encrypt.charAt(i)!=44 && encrypt.charAt(i+1)!=44){
		  			ascii=(Integer.parseInt(encrypt.substring(i, i+2))^c); i+=3;
		  			encrypt2+=(char)ascii+"";}
		  		else
	      			{ascii=(Integer.parseInt(encrypt.substring(i, i+1))^c); i+=2;
	      			encrypt2+=(char)ascii+"";}
	      		total+=ascii;
	  		}
	  	total+=46;
		if(encrypt2.matches(".*[Tt]he.*")&&!encrypt2.matches(".*[%#@^&+:|/\\<>].*"))
			more = false;
		if(!more)return(encrypt2);
		return(""); 
    }
}
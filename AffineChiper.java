import java.util.Scanner;
public class AffineChiper {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter text");
		String plaintext=ob.nextLine();
		String chipertext="";
		char c,enc;
		int k1=5,k2=3,value1,x;
	    int l1=plaintext.length();
	    for(int i=0;i<l1;i++) {
	    	c=plaintext.charAt(i);
	    		if(c>='a'&&c<='z') {
	        		value1=c%97;
	        		x=((value1*k1+k2)%26)+65;
		    		enc=(char)x; 
	    		}
	    		else if(c>='A'&&c<='Z') {
	    			value1=c%65;
	    			x=((value1*k1+k2)%26)+97;
	    			enc=(char)x;
	    		}
	    		else if(c=='.') {
	    			enc='!';
	    		}
         		else if(c=='?') {
	    			enc='/';
	    		}
	    		else if(c=='!') {
	    			enc=',';
	    		}
	    		else if(c==',') {
	    			enc='?';
	    		}
	    		else if(c=='/') {
	    			enc='.';
	    		}
	    		else if(c>=48&&c<=52) {
	    			enc=(char)(c+5);
	    		}
	    		else if(c>=53&&c<=57) {
	    			enc=(char)(c-5);
	    		}
	    		else  {
	    			enc=c;
	    		}
		        
	    		chipertext=chipertext+enc;
    	}
	    String decryptext="";
	    int k3=23,k4=21,value2,y;
	    char d,dec;
		int l2=chipertext.length();
		for(int j=0;j<l2;j++) {
			d=chipertext.charAt(j);
			
				if(d>='A'&&d<='Z') {
					value2=d%65;
					y=(((value2+k3)*k4)%26)+97;
					dec=(char)y;
				}
				else if(d>='a'&&d<='z') {
					value2=d%97;
					y=(((value2+k3)*k4)%26)+65;
					dec=(char)y;
				}
				else if(d=='.') {
	    			dec='/';
	    		}
         		else if(d=='?') {
	    			dec=',';
	    		}
	    		else if(d=='!') {
	    			dec='.';
	    		}
	    		else if(d==',') {
	    			dec='!';
	    		}
	    		else if(d=='/') {
	    			dec='?';
	    		}
	    		else if(d>=48&&d<=52) {
	    			dec=(char)(d+5);
	    		}
	    		else if(d>=53&&d<=57) {
	    			dec=(char)(d-5);
	    		}
	    		else {
	    			dec=d;
	    		}
		        
	    		decryptext=decryptext+dec;
			}
		System.out.println("Encrypted message: "+chipertext);
		System.out.println("Decrypted message: "+decryptext);
		}
		
	    
}


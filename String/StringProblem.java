import java.util.Scanner;
public class StringProblem {

	public static void main(String[] args) {
		
 Scanner sc = new Scanner( System.in);
 System.out.println(" Enter String");
 String str=sc.nextLine().toLowerCase();
 String res="";
 for( int i=0; i<str.length();i++) {
	 char ch =str.charAt(i);
	 if( ch!='a'&&  ch!='e'&&  ch!='i'&& ch!='o'&&   ch!='u' ) {
		 res=res+ch;
				 
	 }
 }
	System.out.println(res);	
	sc.close();
	}

}

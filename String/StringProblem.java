
public class StringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str = "Hello World";
 String res="";
 for( int i=0; i<str.length();i++) {
	 char ch =str.charAt(i);
	 if( ch!='a'&&  ch!='e'&&  ch!='i'&& ch!='o'&&   ch!='u' ) {
		 res=res+ch;
				 
	 }
 }
	System.out.println(res);	
	}

}

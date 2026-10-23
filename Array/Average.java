package array;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,99,80,90};
       int sum=0;
       double avg=0;
       for( int i=0; i<arr.length;i++) {
    	   sum =sum+ arr[i];
    	   avg= sum/arr.length;
    	   
       }  System.out.println(avg);
	}

}

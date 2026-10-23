package array;

public class Max {

	public static void main(String[] args) {
		
		int[][] ar= {{1,2}, {4,2}};
		
		int max=ar[0][0];
for(int i=0;i<ar.length;i++) {
	
	for(int j=0;j<ar.length;j++) {
		
			if(max<ar[i][j]) {
				
				max=ar[i][j];
			}
		}
		
	}
	System.out.println(max);
		
		for(int i=0;i<ar.length;i++) {
			
			for(int j=0;j<ar.length;j++) {
				
				if(ar[i][j]==ar[i][j]) {
					
					System.out.println();
				}
			}
			
		}
		System.out.println(max);
		
		
	}
}

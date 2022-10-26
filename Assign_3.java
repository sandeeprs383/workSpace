
public class Assign_3 {
	
	public static void main(String[] args) {
		int n=19
				;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0||j==0||i+j<=n/2||j==n-1||j-i>=n/2||i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

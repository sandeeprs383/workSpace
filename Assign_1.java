
public class Assign_1 {
	public static void main(String[] args) {
		int n=15;
	
		for(int i=0; i<n; i++) {
			//letter I
			for(int j=0; j<n; j++){
				if(j==n/2||i==n-1||i==0)
					System.out.print("*");
				else
					System.out.print(" "
							);
			}
				System.out.print("  ");
				//Letter N
				for(int k=0; k<n; k++) {
					if(k==0||k==n-1||k==i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				
				System.out.print("  ");
				//Letter E
				for(int l=0; l<n; l++) {
					if(l==0||i==0||i==n/2||i==n-1) 
						System.out.print("*");
						else
							System.out.print(" ");
					}
				
				System.out.print("  ");
				//Letter U
				for(int m=0; m<n; m++) {
					if(m==0&&i!=n-1||i==n-1&&m!=0&&m!=n-1||m==n-1&&i!=n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				
				System.out.print("  ");
				//Letter R
				for(int q=0; q<n; q++) {
					if(q==0||i==q&&q>n/2||i==0&&q<n*3/4&&q!=n*3/4||q==n*3/4&&i<n/2&&i!=n/2&&i!=0
							||i==n/2&&q!=n*3/4&&q<n*3/4)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				
				System.out.print("  ");
				//Letter R
				for(int r=0; r<n; r++) {
					if(i==0&&r!=0&&r!=n-1||r==n-1&&i!=0&&i!=n-1||i==n-1&&r!=0&&r!=n-1||r==0&&i!=0&&i!=n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				
				System.out.print("  ");
				//Letter N
				for(int s=0; s<n; s++) {
					if(s==0||s==n-1||s==i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				
			
			System.out.println();
		}
	}

}

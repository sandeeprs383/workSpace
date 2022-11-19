package assignment_2;

public class Bubble_Sort {
	public static void main(String[] args) {
		
		
		int[] arr = {34,65,99,8,1,49,37,18,22};
		for(int j=0; j<arr.length; j++) {
		for(int i=1; i<arr.length-j; i++) {
			if(arr[i]<arr[i-1]) {
				int tempVar = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = tempVar;
				
			}
		}
		}
		for(int ele: arr) {
			System.out.print(ele+ " ");
		}
	}

}


public class FindSmallestLargest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int arr[]=new int[] {5,10,12,11,14,90,200,30};
		int small=arr[0];
		int large=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>large)
				large=arr[i];
			else if(arr[i]<small)
				small=arr[i];
		}
		System.out.println("Smallest is"+" "+ small);
		System.out.println("Largest is"+" "+ large);

	}

}

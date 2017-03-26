package binarysearch;
import  insertionsort.InsertionHelper;

public class BinarySearch {

	static int binsearch(int A[], int x, int low, int high){
		if(low<high){
			int mid = (low+high)/2;
			if(x>A[mid]){
				return binsearch(A,x,mid+1,high);
			}
			else{
				return binsearch(A,x,low,mid);
			}
		}
		else
			if(A[low] == x){
				return low;
			}
			else{
				return -1;
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {12,22,54,99,22,123,14};
		InsertionHelper help = new InsertionHelper();
		help.print(A);
		help.sort(A);
		help.print(A);
		System.out.println("index is " + binsearch(A,99,0,A.length));
	}

}

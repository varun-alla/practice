import java.util.*;
class question4 
{
	public static void main(String[] args) 
	{
		int[] arr ={1,2,3,4,9,11,15,26};
		Arrays.sort(arr);//if input is not sorted
		question4 q = new question4();
		System.out.print(q.missingNo(arr,arr[0],0));
	}
	int missingNo(int arr[],int k,int i){
		if(i==arr.length)
			return arr[0]-1;
		int a = arr[i]^k;
		if(a==0){
			return missingNo(arr,k+1,i+1);	
		}
		else{
			return k;
		}
	}
}

import java.util.*;
class question6 
{
	public static void main(String[] args) 
	{
		int[][] input = {{2,2,3,2},{2,2,2,1},{1,2,3,4,1,2,4,1,2,4}};//starting no middle no and last no
		question6 q = new question6();
		int[] output = {3,1,3};
		int[]  expected1 = new int[output.length];
		int[]  expected2 = new int[output.length];
		for(int i=0;i<input.length;i++){
		expected1[i]=q.one_three(input[i]);
		expected2[i]=q.one_three(input[i],input[i].length);
		}
		for(int i=0;i<input.length;i++){
		System.out.println(expected1[i]+" "+expected2[i]);
		}
	}
	int one_three(int[] arr){              //O(n)time o(n) space
		HashMap<Integer,Integer> h = new HashMap<>();
		for(int i:arr){
		h.put(i,h.getOrDefault(i,0)+1);
		}
		Set<Integer> s = h.keySet();
		for(int i:s){
			if(h.get(i)==1){
				return i;
			}
		}
		return -1;
	}
	int one_three(int[] arr,int n){
		Arrays.sort(arr);           //in-built dual-pivot quick sort O(nlogn)
		for(int i=1;i<n-1;i=i+3){
			if(arr[i-1]!=arr[i])							// after sorting will be in multiples of 3 places only
				return arr[i-1];	
		}
		return arr[n-1];
	}
}
// tried O(n) time and space but not able to solve
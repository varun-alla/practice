import java.util.*;
class question5
{
	public static void main(String[] args) 
	{
		int[] input = {0,3,2,5,-1,4};
		List<List<Integer>> output  = new ArrayList<>(input.length);
		List<List<Integer>> expectedout = new ArrayList<>(input.length);
		expectedout.add(new ArrayList<Integer>(Arrays.asList(0)));		
		expectedout.add(new ArrayList<Integer>(Arrays.asList(0,1,1,2)));
		expectedout.add(new ArrayList<Integer>(Arrays.asList(0,1,1)));
		expectedout.add(new ArrayList<Integer>(Arrays.asList(0,1,1,2,1,2)));
		expectedout.add(new ArrayList<Integer>(Arrays.asList(-1)));
		expectedout.add(new ArrayList<Integer>(Arrays.asList(0,1,1,2,1)));
		for(int i:input){
			output.add(count(i));	
		}
		for(int i=0;i<input.length;i++){
			System.out.println(output.get(i)+" "+ expectedout.get(i));
			}
	}
	static List<Integer> count(int n){
		if(n<0)//non valid case
			return new ArrayList<Integer>(Arrays.asList(-1));
		List<Integer> re = new ArrayList<>(n+1);
		int m=1;//tracker
		int count=1;//min one number
		re.add(0);//base case
		for(int i=1;i<n+1;i++){
			if(m==i){
				re.add(1);
				m<<=1;
				count=1;
				}else{
					re.add(re.get(count++)+1);
				}
			}
		return re;
	}
}

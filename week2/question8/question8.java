import java.util.*;
class question8 
{
	public static void main(String[] args) 
	{
		int[][] a = {{1,2},{2,3},{3,4}};
		System.out.println(new question8().no_of_events(a));
	}
	int no_of_events(int[][] a){
		Arrays.sort(a,(e1,e2)->Integer.compare(e1[1],e2[1]));
		HashSet<Integer> h = new HashSet<>();
		int no=0;
		for(int[] e:a){
			for(int i=e[0];i<e[1]+1;i++){
				if(h.add(i)){
					no++;
					break;
				}
			}
		}
		return no;
	}
}

class question1 
{
	public static void main(String[] args) 
	{
		question1 q = new question1();
		int[] inputs={3,4,5,7,6,2,0,-1,-2,1};
		for(int n:inputs){
			System.out.print(n);
			int count=q.print(n);
			System.out.println(" "+count);
		}										//writing outputs is clumsy -->so did not write--> please execute .class file to see output
	}
	int print(int count){
		if(count<0){
			return -1;
		}
		if(count==0){
			return 0;
		}
		if(count==1){
			return 1;
		}
		return print_helper(count,count,0,0);
	}
	int print_helper(int left,int right,int i,int count){
		if( left == 0 && right == 0){
			return count+1;
		}
		if(left>0){
			count=print_helper(left-1,right,i+1,count);
		}
		if(left<right){
			count = print_helper(left,right-1,i+1,count);
		}
		return count;
	}
}

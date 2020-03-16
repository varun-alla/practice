class question1 
{
	public static void main(String[] args) 
	{
		question1 q = new question1();
		int[] inputs={3,4,5,7,6,2};
		for(int n:inputs){
			char[] c = new char[2*n];
			System.out.println(n);
			q.print(c,n,n,0);
		}										//writing outputs is clumsy -->so did not write--> please execute .class file to see output
	}
	void print(char[] c,int left,int right,int i){
		if(left==0&&right==0){
			for(char ca :c){
				System.out.print(ca);
			}
			System.out.println();
			return;
		}
		if(left>0){
			c[i]='(';
			print(c,left-1,right,i+1);
		}
		if(left<right){
			c[i]=')';
			print(c,left,right-1,i+1);
		}
	}
}

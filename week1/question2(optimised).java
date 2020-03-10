class question2 
{
	public static void main(String[] args) 
	{
		int[] input1={2,6,0,7,4,3,5,6,7};
		int[] input2 = {6,4,5,1,4,7,8,9,8};
		int[] input3 = {5,3,1,7,8,8,5,4,8};
		int[] expectedout = {3,3,1,0,3,6,1,3,3};
		int[] output = new int[input1.length];
		for(int i=0;i<input1.length;i++){
            System.out.println(minFlip(input1[i],input2[i],input3[i])+" -->"+expectedout[i]);
			}
	}
	public int minFlips(int a, int b, int c) {
    int count=0;
		while(a>0||b>0||c>0){
			int x = c&1;
			int y = a&1;
			int z = b&1;
			a>>=1;
			b>>=1;
			c>>=1;
			if(x==0){
			       if(y==1&&z==1){
					count = count+2;
					}else if(y==1&&z==0){
					count++;
					}else if(y==0&&z==1){
					count++;
					}
            }	
			else{ 
                if(y==0&&z==0){
				        count++;
					}
            }
		}
		return count;
    }
}

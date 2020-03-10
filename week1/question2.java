class question2 
{
	public static void main(String[] args) 
	{
		int[] input1={2,6,0,7,4,3,5,6,7};
		int[] input2 = {6,4,5,1,4,7,8,9,8};
		int[] input3 = {5,3,1,7,8,8,5,4,8};
		int[] expectedout = {3,3,1,0,3,6,1,3,3};
		int[] output = new int[input1.length];
		for(int i=0;i<input1.length;i++)
            System.out.println(minFlip(input1[i],input2[i],input3[i])+" -->"+expectedout[i]);
	}
	static String zeros(String s,int n){
	n=n-s.length();
	while(n-->0){
		s="0"+s;
	}
	return s;
	}
	static int max(int a,int b,int c){
	return a>b?(a>c?(a):(c)):(c>b?(c):(b));
	}
	static int minFlip(int a,int b,int c ){
		String b1 = Integer.toBinaryString(a);//O(n)
		String b2 = Integer.toBinaryString(b);
		String b3 = Integer.toBinaryString(c);
		int n = max(b1.length(),b2.length(),b3.length());
		b1 = zeros(b1,n);
		b2 = zeros(b2,n);
		b3 = zeros(b3,n);//O(n);
		int count=0;
		for(int i=0;i<n;i++){
			char x = b3.charAt(i);
			switch(x){
			case '0': if(b1.charAt(i)=='1'&&b2.charAt(i)=='1'){
								count = count+2;
								}else if(b1.charAt(i)=='1'&&b2.charAt(i)=='0'){
									count++;
								}else if(b1.charAt(i)=='0'&&b2.charAt(i)=='1'){
									count++;
									}break;

			case '1': if(b1.charAt(i)=='0'&&b2.charAt(i)=='0'){
									count++;
								}break;
			}
		}
		return count;
	}
}
class  question4{
    public static void main(String args[]){
	int[] inputs = {1,2,-1,2147483647,4,6,-2,0,1,7};
	int[] outputs = new int[inputs.length];
	int[] expoutputs = {0,1,-1,32,2,3,-1,-1,0,4};
	question4 q = new question4();
	for(int i=0;i<inputs.length;i++)	{		//use curly braces
		outputs[i]=q.Replacement(inputs[i]);
	}
	for(int i=0;i<inputs.length;i++){
		System.out.println(outputs[i]+" "+expoutputs[i]);
	}
	}
	int Replacement(int n) {                     //same function declaration is not possible. Dont use static methods
																	 //java-methon-overloading
																     // create object - question4 q = new question4();
		return Replacement(n,0);
	}
    int Replacement(int n,int k){
		if(n==1){
			return k;
		}
		else if(n==Integer.MAX_VALUE){
			return 32;
		}															//use indentation properly for closing braces
		else if(n<1){
			return -1;
		}
        else if((n&1)==0){
            return Replacement(n>>=1,k+1);		// try doing without k
		}
        else {				// else is enough instead of else if
            int a = Replacement(n-1,k+1);		// change variable names
            int b = Replacement(n+1,k+1);
            return a<b?a:b;				// more readable - a < b ? a : b;
		}
												// not required coz return statement is there in all the if else blocks
    }
}

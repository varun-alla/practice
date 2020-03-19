class question5 
{
	public static void main(String[] args) 
	{
		int[] A = {1, 4, 5, 8, 10 };
		int[] B = {6, 9, 15 };
		int[] C = {2, 3, 6, 6 };
		System.out.println(new question5().solve(A,B,C));
	}
	int min(int a,int b,int c){
		return a<b?(a<c?a:c):(b<c?b:c);
	}
	int max(int a,int b,int c){
		return a>b?(a>c?a:c):(b>c?b:c);
	}
	int solve(int[] A, int[] B, int[] C) { 
        int i, j, k; 
        i = A.length-1; 
        j = B.length-1; 
        k = C.length-1; 
        int min, temp, max; 
        min = max(A[i],B[j], C[k])  - min(A[i],B[j], C[k]); 
        while (i >-1 && j > -1 && k > -1)  { 
			max =  max(A[i],B[j], C[k]);
            temp=  max - min(A[i],B[j], C[k]);
            if (temp < min){
                min = temp; 
			}
            if (A[i] == max){ 
                i --; 
			}else if (B[j] == max){ 
                j --; 
			}else{
                k --;
			} 
        } 
        return min; 
    } 
}

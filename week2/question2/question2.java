class question2 
{
	int[] tree,A;
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		A = arr;
		tree = new int[2*arr.length];
		question2 q = new question2();
		q.build(1,0,arr.length-1);
		System.out.print(q.sum(tree,1,7,arr));
	}
void build(int node, int start, int end)
{
    if(start == end)
    {
        tree[node] = A[start];
    }
    else
    {
        int mid = (start + end) / 2;
        build(2*node, start, mid);
        build(2*node+1, mid+1, end);
        tree[node] = tree[2*node] + tree[2*node+1];
    }
}
	int sum(int[] tree,int qstart,int qend,int[] arr){
		if(qend<qstart)
				return Integer.MIN_VALUE;
		if(qstart<0&&qstart>arr.length-1)
				return Integer.MIN_VALUE;
		if(qend<0&&qend>arr.length-1)
			return Integer.MIN_VALUE;
		return query(1,0,tree.length-1,qstart,qend);
	}
int query(int node, int start, int end, int l, int r)
{
    if(r < start || end < l)
    {
        return 0;
    }
    if(l <= start && end <= r)
    {
        return tree[node];
    }
    int mid = (start + end) / 2;
    int p1 = query(2*node, start, mid, l, r);
    int p2 = query(2*node+1, mid+1, end, l, r);
    return (p1 + p2);
}
//unable to write update//
}

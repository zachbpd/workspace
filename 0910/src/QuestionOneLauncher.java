class QuestionOneLauncher {

	public static void main(String [] args) {
		int[] a = {1,2,3,4,5};
		int[] a2 = {3,6,9};
		boolean one = OneA.inRange (a,1,5);
		System.out.println(one);
		boolean one2 = OneA.inRange(a2, 1, 5);
		System.out.println(one2);
		
		int[] b = {5,4,3,2,1};
		int[] rb=OneB.copyRange(b, 1, 3);
		for(int i:rb)
			System.out.print(i+" ");
		System.out.println();

		int []  c ={2,2,5,8,4,4,6,4};
		int[] rc = OneC.remove(c, 4);
		for (int i:rc)
			System.out.print(i+" ");
		
	}

}

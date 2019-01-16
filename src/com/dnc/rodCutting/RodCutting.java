package com.dnc.rodCutting;

public class RodCutting {

	public static void main(String[] args) {
		int[] p = {0,4,5,13};
		System.out.println(new RodCutting().dnc(p, 3));
	}

	private int dnc(int[] p, int n) {
		if(n==0) {
			return 0;
		}
		int maxP=-1;
		for(int i=1;i<=n;i++) {
			int profit=p[i]+dnc(p, n-i);
			maxP=Math.max(maxP,  profit);
		}
		return maxP;
	} 
	
}

/*
 * 
 * slot machine problem
 * 
 */


package org.pranay.algorihms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SlotMachine {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = new String[n];
		for(int i=0; i<n; i++) {
			input[i] = br.readLine();
		}
		int sum = getSum(input, n);
		System.out.println(sum);
	}
	
	private static int getSum(String[] input, int n) {
		int rows = n;
		int cols = 0;

		int[][] arr = null;

		for(int i=0; i<n; i++) {
			String num = input[i];
			cols = num.length();
			if(i==0)
				arr = new int[rows][cols];
			for (int j = 0; j < num.length(); j++)
			{
				arr[i][j] = Character.getNumericValue(num.charAt(j));
			}
			Arrays.sort(arr[i]);
		}

		int sum = 0;
		for(int i=0; i<cols; i++) {
			int max = 0;
			for(int j=0; j<rows; j++) {
				if(arr[j][i] > max)
					max = arr[j][i];
			}
			sum += max;
		}
		return sum;
	}
}


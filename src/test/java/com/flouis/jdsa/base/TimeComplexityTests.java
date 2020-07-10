package com.flouis.jdsa.base;

import org.junit.Test;

public class TimeComplexityTests {

	@Test
	public void mainTest(){
		O1(1, 2);
		System.out.println("======================================================");
		long startTime = System.nanoTime();
		On(10);
		System.out.println("Time Cost: " + (System.nanoTime() - startTime));
		System.out.println("res: " + On(10));
		System.out.println("======================================================");
		int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		for (int x : arr){
			System.out.print(x + " ");
		}
		System.out.println();
		startTime = System.nanoTime();
		On2(arr);
		System.out.println("Time Cost: " + (System.nanoTime() - startTime));
		for (int x : arr){
			System.out.print(x + " ");
		}
	}

	@Test
	public void timeTest(){
		System.out.println(System.nanoTime());
		int res = 0;
		for (int i = 0; i < 10000; i++){
			res += i;
		}
		System.out.println(res);
		System.out.println(System.nanoTime());
	}

	public void O1(int a, int b){
		System.out.println("a: " + a + "\tb: " + b);
		long startTime = System.nanoTime();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Time Cost: " + (System.nanoTime() - startTime));
		System.out.println("a: " + a + "\tb: " + b);
	}

	public int On(int n){
		int res = 0;
		for (int i = 1; i <= n; i++){
			res += i;
		}
		return res;
	}

	public void On2(int arr[]){
		int len = arr.length;
		for (int i = 0; i < len; i++){
			int minIndex = i;
			for (int j = i + 1; j < len; j++){
				if (arr[j] < arr[minIndex]){
					minIndex = j;
					arr[i] = arr[i] + arr[minIndex];
					arr[minIndex] = arr[i] - arr[minIndex];
					arr[i] = arr[i] - arr[minIndex];
				}
			}
		}
	}


}

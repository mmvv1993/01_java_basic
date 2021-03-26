package review_01;

import java.util.Scanner;

public class Ex02_문제복숩 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//학번과 점수가 한쌍이다. 1001:20 , 1002:45 ,1003, 54
		
		int[] arr = {1001,20 , 1002,45 ,1003,54};
		
		//문제 1)학번을 입력하면 점수출력
		System.out.println("학번입력[1001~1003]");
		int hakbun =scan.nextInt();
		
		for(int i=0; i<6; i++) {
			
			if(arr[i] == hakbun) {
				System.out.println(arr[i+1]+"점");
			}
		}
		//문제 2) 점수를 입력하면 학번출력 
		System.out.println("점수 입력 : ");
		int score = scan.nextInt();
		
		for(int i=0; i<6; i++) {
			if(arr[i] == score) {
				System.out.println(arr[i-1]+"학번입니다.");
			}
		}
		//학번과 국어 수학 점수이다.
		//예) 1001 == (20,43)
		//	1002 == (54,2)
		// 	1003 == (76,6)
		//문제 3) 점수의 합을 입력하면 번호 출력
		//예)63 == > 1001
		int[] arr1 = {1001,20,43,1002,54,2,1003,76,6}; // index =  0 [1] 2 / 3 [4] 5 /6 [7] 8
		
		System.out.println("점수의 합 입력 : ");
		int score1 = scan.nextInt();
		
		int numIdx = 0;
		for(int i=0; i<9; i++) {
			int sum = 0;
			if(arr1[i] % 3 == 1) {
				sum = arr1[i] + arr1[i+1];
			}
			if(score1 == sum) {
				numIdx = i -1;
			}
			
		}
		System.out.println("학번 : "+arr1[numIdx] + " 번 ");

	}

}

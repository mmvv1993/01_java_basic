package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */

public class LoopEx23_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 한개 입력 : ");
		int number = scan.nextInt();
		int x = 0;
		
		for(int i = 2; i <=number; i ++ ) {
			
			x = 0;
			for(int j=1; j <= i; j ++) {
				if(i%j == 0) {
					x++;
				}
			}
			if(x == 2) {
				System.out.println(i + " ");
			}
			
		}

		scan.close();
		
		
	}
	
}

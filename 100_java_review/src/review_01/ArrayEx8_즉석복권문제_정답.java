package review_01;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx8_즉석복권문제_정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		System.out.println("플레이 하려는 참여 인원 : ");
		int cnt = scan.nextInt();
		
		if(cnt <= 0 || cnt > 20) {
			System.out.println("플레이 참여 인원은 1~20 명으로 설정해주세요");
		}else {
			System.out.println("사다리 개수가" + cnt + "개로 설정 되었습니다.");
		}
		
	}

}

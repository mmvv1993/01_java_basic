package review_01;

public class ArrayEx_04 {

	public static void main(String[] args) {
		/*
		 * # 학생성적관리 프로그램[1단계] : 학생점수
		 */
		
		int[] arr = new int[5];
		
		//문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		//예 	1) 87, 11, 92, 14, 47
		arr[0] = 87;
		arr[1] = 11;
		arr[2] = 92;
		arr[3] = 14;
		arr[4] = 47;
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int tot = 0;
		double avg = 0;
		for(int i=0; i<5; i++) {
			tot = tot + arr[i];
		}
		avg = tot / 5.0;
		System.out.println("총점"+tot);
		System.out.println("평균"+avg);
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(arr[i] >= 60) {
				cnt += 1;
			}
		}
		System.out.println("합격생 수 : "  + cnt);

	}

}

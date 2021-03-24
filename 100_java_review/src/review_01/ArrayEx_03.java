package review_01;

public class ArrayEx_03 {

	public static void main(String[] args) {
		/*
		 * # 배열 기본문제
		 */
		
		int[] arr = new int[5];
		
		//문제1) 10부터 50까지 arr배열에 저장
		//정답1) 10 20 30 40 50
		
		System.out.println("문제1 ");
		for(int i=0; i<5; i++) {
			arr[i] = 10*(i+1);
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
		//문제2 ) 4의 배수만 출력
		//정답2) 20 40
		System.out.println("문제2");
		for(int i=0; i<5; i++) {
			if(arr[i] % 4 == 0) {
				System.out.println(arr[i]);
			}
			
		}
		System.out.println("문제3");
		int tot = 0;
		for(int i=0; i<5; i++) {
			if(arr[i] % 4 == 0) {
				tot =  tot + arr[i];
			}
		}
		System.out.println("tot = " + tot);
		
		//문제4) 4의ㅡ 배수의 개수 출력
		System.out.println("문제4");
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(arr[i] % 4== 0) {
				cnt = cnt + 1;
			}
		}
		System.out.println("cnt = " + cnt);
	

	}

}

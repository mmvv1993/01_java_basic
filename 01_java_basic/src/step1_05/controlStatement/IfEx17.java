package step1_05.controlStatement;
/*
 * if (조건식)	{
 * 	명령어;
 * }else if(조건식){
 *  명령어;
 * }else if(조건식){
 * 	명령어;
 * }
 * 
 * - else if문 조건은 '다중 택일'로 참인 조건식을만나면
 * 		이하 조건은 실행하지 않는다.
 * - if없이 단독으로 사용할 수 없다.
 * - else문과 같이 사용할 수 있지만 else문은 맨 아래에 위치해야 한다.
 * - if문과 else if문 사이에는 명령어가 올 수 없다.
 */
public class IfEx17 {

	public static void main(String[] args) {
		
		int finalScore = 61;
		
		if(finalScore >= 60) {
			System.out.println("합격");
		}
		
		if(finalScore < 60) {
			System.out.println("불합격");
		}
		if(finalScore >= 60) {		//조건식이  true 일 때 실행할 명령어
			System.out.println("합격");
		}
		
		else {						//조건식이 false 일 때 실행할 명령어
			System.out.println("불합격");
		}
		
		System.out.println();
		
		finalScore = 85 ; 
		if(finalScore > 90	) {
			System.out.println("A점수");
		}
		else if (finalScore > 80) {
			System.out.println("B점수");
		}
		else if (finalScore > 70) {
			System.out.println("C점수");
		}

	}

}

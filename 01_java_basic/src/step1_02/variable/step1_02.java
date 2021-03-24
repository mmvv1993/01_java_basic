package step1_02.variable;

/*
 * 
 *  # 변수 ( variable )
 *  
 *  - 단 하나의 값을 저장할 수 있는 메모리 공간
 *  
 *  	1) 변수의 선언 그리고 초기화
 *  	
 *  	변수의 선언 	: int nData;	// 메모리 공간 할당
 *  	변수의 초기화	: nData = 0;    // 값 저장
 *  
 *  	
 *  	2) 변수의 선언과 동시에 초기화
 *  	
 *  	int nData = 0;
 *  	
 *  
 *  	3) 변수의 특징
 *  	
 *  	3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [ 고유성 ]
 *  	3-2) 새로운 값이 변수에 저장되면 이전값은 사라진다.
 *  
 * 
 * */
public class step1_02 {

	public static void main(String[] args) {
		
		// 1. 정수 : Integer(int)
		
		int nData; 		//변수의 선언
		nData = 10; 	//변수의 초기화
		System.out.println(nData);
		
		
		// 2. 실수 : float , double
		double fData = 3.14;     //변수의 선언과 동시에 초기화
		System.out.println(fData);
		

	}

}

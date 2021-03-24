package step1_01.print;
//2) 주석(comments) : 설명문을 작성하기 위한 방법으로 프로그램의 실행에 

//2 - 1)라인(line) 주석 : 한줄 주석
/*
 * 2-2)블록(block) 주석 : 여러줄 주석
 * 
 * 00000000000000000000000000000000가
 * 00000000000000000000000000000000을
 * ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ했다.
 * .
 * 3) 에디터 화면 확대 및 축소 : ctrl + [+] , ctrl + [-]
 *  
 *  
 *  4) 뒤로 되돌리기(redo)  : ctrl + z
 *    앞으로 되돌리기(undo) : ctrl + y
 *    
 * 5) 소스파일 저장 
 * 
 * 		ctrl + s	 , 소스를 변경하고 저장하지 않을 경우 
 * 						파일명 왼쪽에 * 표시가 보이게된다.
 * 						(소스를 변경하고 항상 저장하는 습관을 저장	)
 * 
 * 
 * 6) 출력문 자동완성 단축키
 * 
 * 
 *  6-1)sout + ctrl + space
 *  6-2)sysout + ctrl + space
 * 
 *  7) 유용한 단축키 
 *  
 * 		7-1) 복사     : ctrl + alt + 위 or 아래 방향키
 * 		7-2) 이동     : alt        + 위 or 아래 방향키
 * 		7-3) 블록잡기 : shift      + 위 or 아래 방향키
 * 		7-4) 삭제     : ctrl + d
 * 
 */
public class PrintEx01 {

	public static void main(String[] args) {
		
		//tab 으로 들여쓰기 이후 코드를 작성
		System.out.println("====");       //println : 자동 줄바꿈 기능
		System.out.println("메뉴 선택");
		System.out.println("====");
		System.out.println("1) 로그인(login)");
		System.out.println("2) 로그아웃(logout)");
		System.out.println("3) 종료(exit)");
		
		System.out.println( );//아무 내용이 없으면 줄바꿈 기능만 적용(한줄띄기)
		
		System.out.print("출력문 1");
		System.out.print("출력문 2");
		System.out.print("출력문 3");
		
	}

}

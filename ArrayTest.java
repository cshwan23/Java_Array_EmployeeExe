package com.ggg.erp;


public class ArrayTest {

	public static void main(String[] args) {
	
	
	// <1> 배열 객체의 메위주가 저장될 kors 변수 선언.
	// <2> 배열 객체 생성
	// <3> 배열 객체 내부에 int형 변수 5개 선언하고 디폴트 값 0 저장
	//	    이때 배열변수에 접근하는 방법은 
	//		객참변수[Index번호]이다.	
	// <4> 배열 객체의 메위주 리턴하여 kors 변수에 저장.
	int[] kors = new int[5];   // <--배열개수 총 5개를 저장. 
	
	System.out.println(kors[0]);
	// 배열변수에 데이터 저장
	kors[0] = 94;
	//객참변수[0번째] = 데이터저장;
	
	kors[1] = 92;
	kors[2] = 82;
	kors[3] = 76;
	kors[4] = 88;
//	kors[5] = 99; 	// 존재하지 않는 인덱스 번호를 거론하면 코딩상 에러는 안난다. 
					//실행하면 에러가 난다. (runtime error)

	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	//총점이 저장되는 지역변수 tot 선언..
	// <주의> 지역변수는 자동 초기화 되지 않으므로 수동 초기화 해야함.
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	int tot = 0;
	tot = tot + kors[0];
	tot = tot + kors[1];
	tot = tot + kors[2];
	tot = tot + kors[3];
	tot = tot + kors[4];
	System.out.println( "[국어 총점]=> " + tot);
	
	tot = 0; 
	
	for(int i = 0; i < 5 ; i++) {
		
		tot = tot + kors[i];
		
	}
	System.out.println( "[국어 총점]=> " + tot);
	
	
	// 문제가 있다. 배열 갯수가 몇천개면..
	tot = 0; 
	
	for(int i = 0; i < kors.length ; i++) {
		
		tot = tot + kors[i];
		
	}
	System.out.println( "[국어 총점]=> " + tot);
	
	// 몇개가 들어오던 자동으로 저장됐으면 좋겠다.
	// 데이터가 들어오기 전에 데이터의 갯수를 알아야지만 배열 객체를 생성하니깐 
	// 외부에서 들어오는 다량의 데이터는 DB 에서 들어오는데
	// 몇갠지 알 수 없어서 정확한 수를 배열에 담을수가 없다. 모를 땐 배열 사용하기 힘들다. 
	
	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	//  한 줄이 갖는 의미.
	// <1> 배열 객체의 메위주가 저장될 skills 변수 선언.
	// <2> 배열 객체 생성
	// <3> 배열 객체 내부에 String 형 변수 3개를 선언하고 디폴트 값 null 저장
	//	    이때 배열변수에 접근하는 방법은 
	//		객참변수[배열변수의 Index번호]이다.	
	// <4> 배열 객체의 메위주 리턴하여 skills 변수에 저장.
	// [배열]의 변수명은 관용적으로 마지막에 s를 붙인다. 혹은 Arr이 붙는다.(~들, Array, 다량의 데이터)
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	String[] skills = new String[3];

	// 배열 변수에 String 형 데이터 저장.
	skills[0] = "JSP";
	skills[1] = "ASP";
	skills[2] = "PHP";
	
	
	// 반복문을 사용하여 배열변수 안의 데이터를 모두 출력 
	tot = 0; 
	
	for(int i = 0; i < skills.length ; i++) {
		
		System.out.println( skills[i] + "  ");
		
	}	
	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	//  한 줄이 갖는 의미.
	// <1> 배열 객체의 메위주가 저장될 engs 변수 선언.
	// <2> 배열 객체 생성
	// <3> 배열 객체 내부에 String 형 변수 2개를 선언하고 
	//	    이 변수에 또 다른 배열객체를 저장하고
	//		또 다른 배열객체 내부에 int 형 배열변수 3개씩 생성하기
	// 		즉 int 배열변수는 총 2x3 = 6개 가 만들어진다.
	//		이때 배열변수에 접근하는 방법은 
	//		객참변수[배열변수의 Index번호][배열변수의 인덱스번호] 이다.	
	// <4> 배열 객체의 메위주 리턴하여 engs 변수에 저장.
	// [배열]의 변수명은 관용적으로 마지막에 s를 붙인다. 혹은 Arr이 붙는다.(~들, Array, 다량의 데이터)
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	int[][] engs = new int[2][3];
	
	//1행1열 배열변수 지칭해보자. 99 점 들어갈거다. 어떻게 지칭?
	engs[0][0] = 99;
	//1행2열
	engs[0][1] = 88;
	//1행2열
	engs[0][2] = 77;
	//2행1열
	engs[1][0] = 95;
	//2행2열
	engs[1][1] = 85;
	//2행3열
	engs[1][2] = 75;

	// 이렇게 저장한뒤 꺼내야된다.
	// 1학년 학생의 총점을 구해보자구.
		
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	//  영어점수의 총점이 저장되는 지역변수 tot 준비..
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	tot= 0;
	int stuCnt = 0;
	for ( int i = 0 ; i < engs.length ; i++) {
		
		// engs[i].length 를 조심하자.
		for (int j = 0; j < engs[i].length ; j++) {
			
			tot = tot + engs[i][j];
			stuCnt++;
		}
		
	}
	System.out.println("영어총점=> "+tot);
	
	// engs.length 는 행의 길이
	// engs[i].length 그 i행의 열 길이 
	// 학생수 
	System.out.println("학생수=> " + stuCnt);
	System.out.println("영어평균=> " + (double)tot/stuCnt);
	

	
	
	
   }	
}


/*
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문1> 만약 kors[4] = 99; 다음 줄에 kors[5] = 55; 를 삽입하면?
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

=> 에러가 발생하지는 않지만 실행시 에러가 발생한다.
=> 존재하지 않는 인덱스 번호를 서술하면 코딩상 에러는 없고 실행 시 에러를 발생한다. 

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문2> kors[0] = 94; 이전에 System.out.println(kors[0];을 삽입하면?
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

=> 0 출력. 배열변수는 자동 초기화 된다. 

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문3> kors[0] = 94; 이전에 System.out.println(kors[0];을 삽입하면?
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

=> 에러발생. 현재 배열변수의 자료형은 int 이므로 실수가 저장될 수 없다.
	
	
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문4> 현재 skills 이란 변수에 저장된 데이터의 종류는? 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

=> 1차원 Array 객체가 들어있다. ( 직선처럼 1자로 되어있어서 1차원 배열객체)

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문5> skills[0] = "JSP"; 이전에 System.out.print(skills[0]);를 출력하면?
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
=> null 출력. 

배열변수는 자동초기화 된다.
현재 배열 변수의 자료형은 참조형이므로 null로 자동 초기화된다.

 기본형이 아니면 디폴트값으로 null 이 들어간다.


<참고> null 이란.
참조형데이터의 하나로서, 객체의 메위주가 아직은 없음. 나중에 들어갈 예정이니
이거라도 가지고 있어라고 하는 일종의 더미 데이터. 객체의 메위주가 들어갈 예정이라고 생각해야함. 

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문6> 

int[] kor = new int[5];
kors[0] = 94;
~
kors[4] = 99;

위 코딩은 다음 형식 3가지로 대체할 수 있다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

<대체 형식 1> 
	int[] kors = new int[]{ 94,82,76,88,99 };
<대체형식 2>
	int[] kors = { 94,82,76,88,99 };
<주의> 다음형식은 안됨.
	int[] kors;
	kors = { 94,82,76,88,99 };
	
	
	
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
<문7>  메소드 안에서 배열 객체의 메위주를 리턴할 경우 아래처럼 되는게 있고 안되는게 있다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

<예1>-OK

int[] xxx(){
int[] kors = new int[5];
kor[0] = 99;
return kors;

//return 배열객체의 매위주를 리턴 하는데 데이터형은 int 다.

<예2>-OK


int[] xxx(){
int[] kor = new int[]{99};
return kor;
}


<예3>-OK
int[] xxx(){
int[] kors = {99};
return kors;


<예4>-OK

int[] xxx(){

return new int[]{99};


<예5>-NG(new 없이 하면 안된다. )
(return 다음바로 중괄호 데이터가 나오면 안된다.나머진 다된다.)

int[] xxx(){

return {99};





/public Speed mmm() {실행구문;}

/public Speed[] mmm() {실행구문;}


인터페이스가 나오면 인터페이스의 타겟이 가 있는 타겟에 관심을 가져라 



ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 
문1> 아래 문제에서 출력답을 고르면? 정답 B
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 
int dex = 1;
int[] test = new int[3]
int foo = test[index];
System.out.println("foo=" +foo);

what is result
A. foo = B. foo = null
C. 컴파일 
A. foo = 


ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 
문2> 아래문제 출력한답을고르면(배열이 아니라 지역변수개념)
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 
public static void main(String [] args){
int index;
char[] array = "xyz
System.out.println ( arraay[index]);

A. x
B. y
C. z
D.컴파일 에러
E 실행시 에
실행시 
정답D


문3> 아래문제 출력한답을고르면(배열이 아니라 지역변수개념)
public static void main(String [] args){
int index = -1
char[] array = "xyz
System.out.println ( arraay[index]);

A. x
B. y
C. z
D.컴파일 에러
E 실행시 에
실행시 
정답E
	=> 바열변수의 []안에 들어가는 값은 정수면 일단 컴파일 가능하다.
	   실행시 존자ㅐ하지 않는 인덱스 번호라면 예외가 발생한다.
	   범위를 벗어난 배열변수를 찾을 수 없기 때문이다.
	   
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ   
문4> 아래 문제에서 출력답을 고른다면
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 
class Test {
	public static int [] x;
}
public class Exe {
	public static void main(String[] args){
		System.out.println(Test.x[0]);
	}
}
	=> 예외 발생, NullPointerException 예외 발생.
		x 변수는 존재하나 x 변수에 배열객체의 메위주가 없으므로.
	=> 현재 속성변수 x에는 null 이 저장되어있다.
		즉 배열 객체가 생성이 안되어있다. 그러므로 x[0]으로 배열변수에 접근할 수 없다.
			
		NullPointerException
		=> 객체생성도 안됬는데 메소드나 속성변수를 호출할때 나타나는 에러
	  
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 
문5> 아래 문제에 출력답을 고르면?*******중요****	   
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
class XX{

public static void modify(int[] a) {
		a[0]++;
	}
}
public class Exe {

	public static void main(String[] args) {
		int[] a = new int[1];
		XX.modify(a);
		System.out.println(a[0]);
	}
}
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
정답 : 1 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
문6> 아래 문제의 출력답을 고르면?
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
String foo = "blue";
boolean[] bar = new boolean[1];
		
if (bar[0]) {
	foo = "green";
}
System.out.println(foo);
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
정답 : blue
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	 
  
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	   
문7>   객체생성 되는거 두가지 고르시오 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	   
	   int[] ia = new int[15];
	   float fa = new float[2];
	   char[] ca = "Some String";
	   Object oa = new float[2];
	   int a[][] = {4,5,6} {1,2,3};
	   
	   
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
정답 : AD(모든객체의조상은 Object 이다.)

B는 대괄호가빠짐
C char 는 String 이여야
E 는 대괄호[][] 는 왼쪽으로 와도 오른쪽으로와도된다(객참변수앞에와도 상관없다)
	[{4,5,6},{1,2,3}] 이여야한다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	   
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	   
문8>   아래문제의 출력답을 고르시오.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	   
float[] f1;
float[] f2;
	f1 = new float[1];
	f2 = f1;
System.out.println( f2[0]);
}
}
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
정답 : 0.0   -> 변수추적능력 ( f2 는 f1 객체메위주가 담긴다 똑같다. 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	   
	   
	   
	   
	   
 */ 

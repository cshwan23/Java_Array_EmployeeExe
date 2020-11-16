# Java_Array_EmployeeExe
Java_Array_EmployeeExe


Career[] careers = new Career[2];
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
배열 객체를 저장할 변수 carrers 선언 
배열 객체의 메위주 저장하기.
배열 객체 안의 배열변수에는 Career 객체의 메위주가 들어갈 예정이다.
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ





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
 
 
    package com.ggg.erp;


    class Employee {
	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	//속성변수 선언
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	private int emp_no;
	private String emp_name;
	private String phone;
	//직원의 경력 (일했던 곳 회사의 정보)
	// Career 클래스를 변수로 정함. 
	private Career[] careers;    //Career[] 객체 저장. // 배열객체인데 커리어가 들어있다.

	//career 클래스를 저장하고싶다 -> getter setter만들기
	// employee 객체를 career[] 배열객체안으로 담을수 있게 되었다 
	
	
	
	public int getEmp_no() {
		return emp_no;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public String getPhone() {
		return phone;
	}
	public Career[] getCareer() {
		return careers;
	}
	
	
	
	
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setCareer(Career[] career) {
		this.careers = career;
	}
	

	
	
    }
    //[경력정보]를 관리하는 Career 클래스 선언하기.
    class Career{
 	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// 속성변수 선언 
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	//회사 corp (corperation)
    private String cor_name;
    private String jikup;
    private String enter_date;
    private String retired_date;



    //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
    // getter, setter 메소드 선언
    //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
    public String getCor_name() {
    	return cor_name;
    }
    public String getJikup() {
    	return jikup;
    }
    public String getEnter_date() {
    	return enter_date;
    }
    public String getRetired_date() {
    	return retired_date;
    }
    public void setCor_name(String cor_name) {
    	this.cor_name = cor_name;
    }
    public void setJikup(String jikup) {
    	this.jikup = jikup;
    }
    public void setEnter_date(String enter_date) {
    	this.enter_date = enter_date;
    }
    public void setRetired_date(String retired_date) {
    	this.retired_date = retired_date;
    }

	
    }


    public class EmployeeExe {

	public static void main(String[] args) {

		//Career클래스 객체화시키기.
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 배열 객체를 저장할 변수 careers 선언하고
		// 배열 객체의 메위주 저장하기
		// 배열 객체 안의 배열변수에는 Career 객체의 메위주가 들어갈 예정이다.
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		Career[] careers = new Career[3];
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//1번째 배열변수에 Career 객체 생성해서 객체 메위주를 저장하기.
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		careers[0] = new Career();
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//1번째 배열변수에 저장된 Career 객체의 setter 메소드를 호출하여
		// 각종 데이터 저장하기.
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		careers[0].setCor_name("삼성");
		careers[0].setJikup("대리");
		careers[0].setEnter_date("2018-12-25");
		careers[0].setRetired_date("2019-12-25");	

		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//2번째 배열변수에 Career 객체 생성해서 객체 메위주를 저장하기.
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		careers[1] = new Career();	
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		// 2번째 배열변수에 저장된 Career 객체의 setter 메소드를 호출하여
		// 각종 데이터 저장하기.
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		careers[1].setCor_name("LG");
		careers[1].setJikup("과장");
		careers[1].setEnter_date("2015-12-25");
		careers[1].setRetired_date("2016-12-25");
	
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//3번째 배열변수에 Career 객체 생성해서 객체 메위주를 저장하기.
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		careers[2] = new Career();
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 3번째 배열변수에 저장된 Career 객체의 setter 메소드를 호출하여
		// 각종 데이터 저장하기.
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		careers[2].setCor_name("SK");
		careers[2].setJikup("차장");
		careers[2].setEnter_date("2017-12-25");
		careers[2].setRetired_date("2018-12-25");
		
		
		
		//Employee 객체 만들기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// Employee 를  젖아할 변수 employee 를 선언하고
		//Employee 객체 생성후 객체의 메위주 저장하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		Employee employee = new Employee();
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//Employee를 객체의 setter 메소드 호출하여
		//각종 데이터 저장하기
		employee.setEmp_no(1);
		employee.setEmp_name("최승환");
		employee.setPhone("010-4168-0613");
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//한가지 더 저장.
		//Career 객체 메위주를 저장해야한다***
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		employee.setCareer(careers);
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 한회사가 아니라 더 있을 거다. 
		// 더있을경우 또 카피해서 만들거야?
		// 경력회사가 30개면 30개 다 복붙해서 넣을거야?
		
		//경력 정보 다 꺼내기.
		// Employee를 객체에 저장된 각종 정보를 getter 메소드를 호출하여
		// 얻은 후 도스창에 출력하기
		System.out.println("[직원번호] => " + employee.getEmp_no());
		System.out.println("[직원이름] => " + employee.getEmp_name());
		System.out.println("[직원전화] => " + employee.getPhone());
		
		
		
		
		
		//employee 안에 객체 꺼내자.*****중요 이해 x 
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//Employee를 객체의 getCareer 메소드를 호출하여
		//배열객체의 메위주 얻어서 careers2에저장하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		Career[] careers2 = employee.getCareer();
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 배열객체에 저장된 carrer 객체를 꺼내어
		// Career 객체의 각종 정보를 getter 메소드를 호출하여 꺼내어
		// 도스창에 출력하기 
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		for ( int i = 0 ; i < careers2.length ; i++) {		
			System.out.println("--------------------");
			System.out.println("[경력회사 " + (i+1) + "]");
			System.out.println("--------------------");
			System.out.println("[회사명 " + careers2[i].getCor_name()+"]");
			System.out.println("[직급명 " + careers2[i].getJikup()+"]");
			System.out.println("[입사일 " + careers2[i].getEnter_date()+"]");
			System.out.println("[퇴사일 " + careers2[i].getRetired_date()+"]");
		}	
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			System.out.println(employee.getCareer()[1].getJikup());

		
  	}

    }

 
 
 

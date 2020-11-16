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

/*
 아래코딩은 다른형식으로 대체할 수 있다.
 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 int[][] xxx = new int [2][2];
 xxx[0][0] = 99;
 xxx[0][1] = 89;
 xxx[1][0] = 79;
 xxx[1][1] = 69;
 
 int [][] xxx = new int [2][];
 xxx[0] = new int[2];
 xxx[1] = new int [2];
 xxx[0][0] = 99;
 xxx[0][1] = 99;
 xxx[1][0] = 99;
 xxx[1][1] = 99;
 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
int[][] xxx = {
{99,88,77},{95,85,75}
}:
 
 
 
 
 
 
 
 */















package movie;

public class Movie {
	//필드
	String movieName; //영화명
	int price; //금액
	int age; //나이
	int money; //실구매금액
	double rate; //할인율
	String way; //구매방법(현장, 인터넷, 쿠폰)
	
	//생성자
	public Movie(String movieName, int price, int age, String way) {
	//매개변수로 값을 받아서 멤버변수에 넣기
	//this는 생성자에 의해 생성된 객체 자신을 가리킨다.
	//this
	this.movieName = movieName;
	this.price = price;
	this.age = age;
	this.way = way;
}
	//메소드
	//1.할인율
	// cal = 계산하다
	void rateCal() {
		/*
		 *1) 나이가 20미만이면 25%할인,
		 *나이가 20~30이면 20%할인, 30이상면 15%할인
		 *2) 현장구매인 경우 0%할인
		 *인터넷 구매인 경우 추가 5%할인,
		 *쿠폰구매인 경우 10%할인
		 */
		//rate는 할인율 초깃값으로 0을 넣는다
		rate=0;
		//if, else if는 조건식 1이 참이면 1실행, 거짓이면 조건식2가 참일 때 실행...
		//나이가 20미만이면 할인율 
		if(age<20) {
			rate= rate+0.25;
		}
		else if(age>=20&&age<30) {
			rate= rate+0.20;
		}
		else {
			rate=rate+0.15;
		}
		
		switch(way) {
		case "현장" :
			rate=rate+0.00;
			break;
		case "인터넷":
			rate=rate+0.05;
			break;
		case "쿠폰":
			rate=rate+0.10;
			break;
		}
				
	}
	//2. 실구매금액
	// 실구매금액 계산
	void moneyCal() {
		
		money= (price- (int) (price*rate));
		
	}

	//3. 제목인쇄하기
	void titlePrint() {
		System.out.println("영화명"+"\t"+"금액"+"\t"+"나이"+"\t"+"실구매금액");
	
	}
	
	//4. 내용 출력하기
	void dataPrint() {
		System.out.println(movieName+"\t"+price+"\t"+age+"\t"+money);
	}
}
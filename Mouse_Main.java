package 마우스클래스;

public class Mouse_Main {

	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.leftClick();
		mouse.rightClick();

		Mouse_Wheel mouse2 = new Mouse_Wheel();
		mouse2.leftClick(); // 상속
		mouse2.rightClick(); // 상속
		mouse2.Scroll(); // 확장

		// 업캐스팅 -> 하위 클래스의 객체가 상위클래스의 객체 타입으로 형 변환
		Mouse mouse3 = mouse2;
		mouse3.rightClick();
		// 오버라이딩한 기능일 경우
		// 업캐스팅 하더라도 자식에 있는 기능을 사용
		mouse3.leftClick();

	}

}

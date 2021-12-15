package 마우스클래스;

public class Mouse_Wheel extends Mouse {
	public void Scroll() {
		System.out.println("스크롤을 굴렸습니다");
	}

	@Override
	public void rightClick() {
		System.out.println("오른쪽클릭");
		System.out.println("드래그");
	}

	// 오버라이딩 -> 상속관계에서 자식 클래스가
	// 부모클래스의 기능을 재정의 할때 사용
	@Override
	public void leftClick() {
		System.out.println("왼쪽클릭");
		System.out.println("드래그");
	}

}

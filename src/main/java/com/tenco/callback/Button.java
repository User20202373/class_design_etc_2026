package com.tenco.callback;

//버튼이 눌러졌을 때 클릭한 동작을 명시하는 인터페이스를 정의(콜백 메서드 정의)
interface IButtonListener{
    void clickEvent(String event);
    //void clickDbEvent(String event);
}

// 버튼 클래스 설계
public class Button {

    String name; // 버튼 이름
    //버튼에 연결된 리스너(콜백 메서드)
    IButtonListener iButtonListener;

    public Button(String name){
        this.name = name;
    }

    //외부에서 인터페이스 타입을 (구현) 클래스를 인수로 넣어줄 수 있다
    //콜백 메서드를 설정하는 메서드
    public void addListener(IButtonListener iButtonListener){
        this.iButtonListener = iButtonListener;
    }

    //버튼이 클릭 되었을 때 메서드 호출( 콜백 메서드 호출)
    public void click(String message){
        // 어머기 메세지를 돌아 오게 할 수 있록 (휴대폰)
        iButtonListener.clickEvent(message);
        //System.out.println("ㅠㅠ 배터리가 없어 엄마에게 호출을 못함");
    }

}

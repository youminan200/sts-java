
class Circle {

    int radius;

    // 생성자: 반지름을 초기화함
    public Circle(int radius) {
        this.radius = radius; // 기존 코드의 'this.radius.'에서 마침표 제거
    }

    // 원의 면적을 계산하여 반환
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class CircleArray {

    public static void main(String[] args) {
        Circle[] c;           // 1. 객체 배열에 대한 레퍼런스 변수 선언
        c = new Circle[5];    // 2. 5개의 레퍼런스를 담을 배열 생성

        // 3. 각 배열 요소에 실제 Circle 객체 생성 및 대입
        for (int i = 0; i < c.length; i++) {
            c[i] = new Circle(i);
        }

        // 배열에 저장된 각 객체의 면적 출력
        for (int i = 0; i < c.length; i++) {
            System.out.print((int) (c[i].getArea()) + " ");
        }
    }
}

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // 1. Scanner 객체를 생성해야 합니다. (System.in은 키보드 입력을 의미함)
        Scanner scanner = new Scanner(System.in);

        int dividend;
        int divisor;

        System.out.print("나뉨수를 입력하시오: ");
        dividend = scanner.nextInt();
        
        System.out.print("나눗수를 입력하시오: ");
        divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        } else {
            int quotient = dividend / divisor;
            System.out.println("몫은 " + quotient + "입니다.");
        }

        // 2. 사용이 끝난 scanner는 닫아주는 것이 좋습니다.
        scanner.close();
    }
}
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("숫자 맞추기 (Up & Down) 게임을 시작합니다!");
        System.out.println("1부터 100 사이의 숫자를 맞춰보세요.");

        while (guess != targetNumber) {
            System.out.print("숫자를 입력하세요: ");
            
            // 숫자가 아닌 값이 입력될 경우를 대비한 간단한 체크 (선택사항)
            if (!UserInput.hasNextInt()) {
                System.out.println("숫자만 입력 가능합니다!");
                UserInput.next(); // 잘못된 입력 버리기
                continue;
            }

            guess = UserInput.nextInt();
            attempts++;

            if (guess > targetNumber) {
                System.out.println("Down! 더 작은 숫자입니다."); // 1. System.out 사용 권장
            } 
            else if (guess < targetNumber) { // 2. 부등호 방향 수정 (<)
                System.out.println("Up! 더 큰 숫자입니다.");
            } 
            else {
                System.out.println("정답입니다! 총 " + attempts + "번 만에 맞추셨네요.");
            }
        }
        
        // 3. Scanner 닫기 위치 이동 (반복문 종료 후)
        UserInput.close();
    }
}
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame2 {

    public static void main(String[]  args){
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        int[] guessHistory = new int[100];

        System.out.println("숫자 맞추기(Up & Down) 게임을 시작합니다!");
        System.out.println("1부터 100 사이의 숫자를 맞춰보세요.");

        while (guess != targetNumber){
            System.out.print("숫자를 입력하세요: ");
            guess = userInput.nextInt();
            guessHistory[attempts] = guess;
            attempts++;

            if(guess > targetNumber){
                System.out.println("Down! 더 작은 숫자입니다.");
            } else if(guess < targetNumber){
                System.out.println("Up! 더 큰 숫자입니다.");
            } else{
                System.out.println("정답입니다! 총" + attempts + "번 만에 맞추셨네요.");
                System.out.println("당신의 입력 기록: ");

                for(int i = 0; i < attempts; i++){
                    System.out.print(guessHistory[i]);
                    if(i < attempts - 1){
                        System.out.print(",");
                    }
                }
                System.out.println();
            }
        }
        userInput.close();
        
    }
    
}

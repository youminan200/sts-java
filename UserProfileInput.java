import java.util.Scanner;

public class UserProfileInput {
    private String name;
    private String age;
    private Scanner scanner = new Scanner(System.in);

    public void run(){
        System.out.println("--- 프로필 입력 (종료 : exit, 나이 생략 : skip) ---");

        while (true) {
            System.err.print("\n이름을 입력하세요 (종료는 exit) >>");
            this.name = scanner.nextLine();
            if(this.name.equals("exit")){
                break;
            }

            System.out.print("나이를 입력하세요 (생략하려면 skip) >>");
            this.age = scanner.nextLine();
            if(this.age.equals("skip")){
                System.out.println("[알림]" + this.name + "님의 나이 정보는 생략되었습니다.");
                continue;
            }
            System.out.println("[완료] 이름 : "+ this.name + ", 나이 : " + this.age + "세");
            }
            scanner.close();
    
        }
        public static void main(String[] args) {
            UserProfileInput program = new UserProfileInput();
            program.run();
        }
}

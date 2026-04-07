import java.util.Scanner;

public class WhileLoop{
    int count;
    double sum;

    public WhileLoop(){
        this.count = 0;
        this.sum = 0;
    }

    public void procesInputs(){
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
        while ((n = scanner.nextInt()) != 0 ){
            this.sum += n;
            this.count++;
        }
        scanner.close();
    }
    public void printResult(){
        double average = this.sum / this.count;
        System.out.print("수의 개수는" + this.count + "개이며");
        System.out.println("평균은" + average + "입니다.");
    }

    public static void main(String[] args){
        WhileLoop myApp = new WhileLoop();

        myApp.procesInputs();
        myApp.printResult();
    }
}
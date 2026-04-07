public class ForLoop {
    int sum;
    public ForLoop(){
        this.sum = 0;
    }

    public void printSum(int limit){
        for (int i = 1; i <= limit; i++){
            this.sum += i;
            System.out.print(i);
           
            if(i < limit) {
                System.out.print("+");
            } else {
                System.out.print("=" + this.sum);
            }
        }
        System.out.println();
    }
        public static void main(String[] args){
            ForLoop myCalculator = new ForLoop();

            myCalculator.printSum(10);
        }
}
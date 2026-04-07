class NestedLoop {
        int startNum;
        int endNum;
    public NestedLoop(int StartN, int endN){
        this.startNum = StartN;
        this.endNum = endN;
    }
    public void printMinxedLoops(){
        for (int i = 1; i < 10; i++){
            int j = 1;

            while (j < 10){
                System.out.print(i + "*" + j + "=" + (i * j));
                System.out.print('\t');
                j++;
            }
            System.out.println();
        }
    }
}

public class Main{
    /**
     * @param args
     */
    public static void main(String[] args) {
        NestedLoop oneToNine = new NestedLoop(1, 9);
        oneToNine.printMinxedLoops();
    }
}
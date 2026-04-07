class PointHash{
    private int x, y;
    public PointHash(int x, int y){
        this.x = x; this.y = y;
    }
}

public class ObjectPropertyEx{

    public static void main(String[] args) {
        PointHash p = new PointHash(2,3);
        System.out.println(p.getClass().getName());
        System.out.println(p.hashCode());
        System.println(p.toString());
    }
}
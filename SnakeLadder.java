class SnakeLadder {
    public int position=0;
    public int displayposition(){
        return position;
    }
}
class MainClass{
    public static void main(String[] args) {
        SnakeLadder sl = new SnakeLadder();
        System.out.println("Position is:"+sl.displayposition());
    }
}

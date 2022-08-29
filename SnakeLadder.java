class SnakeLadder {
    public int position=0;

    public void displayposition(){
        System.out.println("Position is " +position);
        System.out.println();
    }
    public int dice(){
        int roll=(int)Math.floor(Math.random()*10%6+1);
        System.out.println("Roll Dice Value : "+roll);
        return roll;
    }
}

class MainClass{
    public static void main(String[] args) {
        SnakeLadder sl = new SnakeLadder();
        sl.dice();
    }
}

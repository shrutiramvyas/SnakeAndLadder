class SnakeLadder {
    public int position=0;
    public void displayposition(){
        System.out.println("Position is " +position);
    }
    public int dice(){
        int roll=(int)Math.floor(Math.random()*10%6+1);
        System.out.println("Roll Dice Value : "+roll);
        return roll;
    }
    public int choice(){
        int ch=(int)Math.floor(Math.random()*10%3);
        switch(ch){
            case 0:
                System.out.println("nothing comes");
                position=position;
                break;
            case 1:
                System.out.println("Ladder comes");
                position+=dice();
                break;
            case 2:
                System.out.println("Snake Comes");
                if (position==0){
                    position=0;
                }
                else {
                    position -= dice();
                }
                break;
        }
        displayposition();
        return position;
    }
}

class MainClass{
    public static void main(String[] args) {
        SnakeLadder sl = new SnakeLadder();
        sl.choice();
    }
}

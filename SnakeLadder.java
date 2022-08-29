class SnakeLadder {
    public int position=0;
    public static final int max_position =100;
    public void displayposition(){
        System.out.println("Position is " +position);
        System.out.println();
    }
    public int dice(){
        int roll=(int)Math.floor(Math.random()*10%6+1);
        System.out.println("Roll Dice Value : "+roll);
        return roll;
    }
    public int choice() {
        while (position < max_position) {
            int ch = (int) Math.floor(Math.random() * 10 % 3);

            switch (ch) {
                case 0:
                    System.out.println("nothing comes");
                    position = position;
                    displayposition();
                    break;
                case 1:
                    System.out.println("Ladder comes");
                    position+=dice();

                    else{
                        position =position;
                        displayposition();
                    }
                    break;
                case 2:
                    System.out.println("Snake Comes");
                    position-=dice();
                    displayposition();
                    break;
            }
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
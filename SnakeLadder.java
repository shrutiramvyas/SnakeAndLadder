class SnakeLadder{
    public boolean player1=true;
    public boolean player2=false;
    public int player1_position=0;
    public int player2_position=0;
    public int count_position_player1=0;
    public static final int max_position =100;
    public void displayposition() {
        if (player1 == true) {
            System.out.println("Player1 Position is " + player1_position);
            System.out.println();
        } else {
            System.out.println("Player2 Position is " + player2_position);
            System.out.println();
        }
    }
    public int dice(){
        int roll=(int)Math.floor(Math.random()*10%6+1);
        System.out.println("Roll Dice Value : "+roll);
        return roll;
    }
    public int nothing_comes(){
        System.out.println("nothing comes");
        displayposition();
        if(player1==true){
            return player1_position;
        }
        else{
            return player2_position;
        }
    }
    public int ladder(){
        System.out.println("Ladder comes");
        if(player1==true) {
            player1_position += dice();
            if (player1_position >= max_position) {
                player1_position = max_position;
                displayposition();
            } else {
                player1_position = player1_position;
                displayposition();
            }
            return player1_position;
        }
        else {
            player2_position += dice();
            if (player2_position >= max_position) {
                player2_position = max_position;
                displayposition();
            } else {
                player2_position = player2_position;
                displayposition();
            }
            return player2_position;
        }
    }

    public int snake(){
        System.out.println("Snake Comes");
        if(player1==true){
            player1_position -= dice();
            if (player1_position <= 0) {
                player1_position = 0;
                displayposition();
            } else {
                player1_position = player1_position;
            }
            displayposition();
            return player1_position;
        }
        else{
            player2_position -= dice();
            if (player2_position <= 0) {
                player2_position = 0;
                displayposition();
            } else {
                player2_position = player2_position;
            }
            displayposition();
            return player2_position;
        }
    }

    public void slchoice(){
        int ch = (int) Math.floor(Math.random() * 10 % 3);
        count_position_player1++;
        switch (ch) {
            case 0:
                nothing_comes();
                break;
            case 1:
                ladder();
                if(player1_position==max_position){
                    break;
                }
                else if(player2_position==max_position){
                    break;
                }
                System.out.println("Chance again");
                slchoice();
                break;
            case 2:
                snake();
                break;
        }
    }
    public void choice() {
        while(player1_position < max_position || player2_position < max_position){
            if (player1 == true) {
                System.out.println("-----------------------------");
                System.out.println("Player1 chance: ");
                if(player1_position<=max_position) {
                    slchoice();
                }
                if(player1_position==max_position){
                    System.out.println("Player 1 Wins");
                    break;
                }
                player2=true;
                player1=false;
                }
            else if (player2==true) {
                System.out.println("-----------------------------");
                System.out.println("Player2 chance: ");
                if(player2_position<=max_position) {
                    slchoice();
                }
                if(player2_position==max_position){
                    System.out.println("Player2 Wins");
                    break;
                }
                player1=true;
                player2=false;
            }
            displayposition();
        }
    }
}

class MainClass{
    public static void main(String[] args) {
        SnakeLadder sl = new SnakeLadder();
        sl.choice();
    }
}
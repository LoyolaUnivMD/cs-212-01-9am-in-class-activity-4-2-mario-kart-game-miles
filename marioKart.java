public class MarioKartPlayer {
  private String playerName;
  private String character;
  private int speed;

  public MarioKartPlayer(String playerName, String character, int speed){
    this.playerName =  playerName;
    this.character = character;
    this.speed = speed;


  }
  public void boost(){
    speed+=15;
  }

  public void showStats(){
    System.out.println("Player Name: " + playerName);
    System.out.println("Character: " + character);
    System.out.println("Speed: " + speed);
  }
  public static void main(String[] args) {
    MarioKartPlayer player1 = new MarioKartPlayer("Player 1", "Yoshi", 50);
    MarioKartPlayer player2 = new MarioKartPlayer("Player 2", "Toad", 65);

    player1.showStats();
    player2.showStats();
    

    player1.boost();
    player2.boost();
    System.out.println("\n");
    System.out.println("Stats after boosting ");
    player1.showStats();
    player2.showStats();
  }

} 

public class TestGame {
    public static void main(String[] args) {
        GamePlayer player1 = new GamePlayer();
        player1.setDimension(10, 5);
        player1.getWidth(player1);
        player1.getHeight(player1);
        player1.setPosition(60, 60);
        player1.getY(player1);
        player1.getX(player1);
        player1.Run();
        player1.Run(30);
        System.out.println("Width "+getWidth() +" height "+getHeight()+" X position "+getX()+" Y position "+getY());

        GameEnemy enemy1 = new GameEnemy();
        enemy1.setDimension(10, 10);
        enemy1.getWidth();
        enemy1.getHeight();
        enemy1.setPosition(60, 60);
        enemy1.getY();
        enemy1.Run();
        System.out.println("Width "+getWidth(+" height "+getHeight()+" X position "+getX()+" Y position "+getY());
    }
}
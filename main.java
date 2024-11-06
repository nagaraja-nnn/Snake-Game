package snake;

import java.awt.Graphics;

public interface main {
	public void move();

	public void gameOver(Graphics graphics);

	public void checkHit();

	public void addFood();

	public void checkFood();

	public void playGame();

	public void draw(Graphics graphics);
}

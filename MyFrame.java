import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener{

	 Draw drawing;
 
	 public MyFrame(){
	 	this.drawing = new Draw();
	 }
	 

	public void keyPressed(KeyEvent e){

		
		if(e.getKeyCode() == KeyEvent.VK_UP){
			System.out.println("boom!");
			drawing.moveUp();
			System.out.println("pos:" + drawing.x + ", " + drawing.y);

		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN){
			drawing.moveDown();
			System.out.println("pos:" + drawing.x + ", " + drawing.y);

		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			drawing.moveLeft();
			System.out.println("pos:" + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			drawing.moveRight();
			System.out.println("pos:" + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE){
			drawing.attack();
			System.out.println("attack!");
		}
		else if(e.getKeyCode() == KeyEvent.VK_S){
			drawing.spawnEnemy();
		}

		drawing.reloadImage();
	}


	public void keyReleased(KeyEvent e){

	}

	public void keyTyped(KeyEvent e){

	}


	public static void main(String args[]){

		MyFrame gameFrame = new MyFrame();

		gameFrame.setSize(820,375);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
		gameFrame.getContentPane().add(gameFrame.drawing);
		gameFrame.addKeyListener(gameFrame);
		System.out.println("Practical Programming");
	}
}

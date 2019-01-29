import javax.swing.JComponent;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;


public class Draw extends JComponent{

	private BufferedImage image;
	private BufferedImage backgroundImage;
	public URL resource = getClass().getResource("run0.png");

	// circle's position
	public int x = 30;
	public int y = 30;

	public int state = 0;

	public Draw(){
		try{
			image = ImageIO.read(resource);
			backgroundImage = ImageIO.read(getClass().getResource("background.gif"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	public void reloadImage(){
		state++;

		if(state == 0){
			resource = getClass().getResource("run0.png");
		}
		else if(state == 1){
			resource = getClass().getResource("run01.png");
		}
		else if(state == 2){
			resource = getClass().getResource("run02.png");
		}
		else if(state == 3){
			resource = getClass().getResource("run03.png");
		}
		else if(state == 4){
			resource = getClass().getResource("run04.png");
		}
		else if(state == 5){
			resource = getClass().getResource("run05.png");
			state = 0;
		}	
		
		try{
			image = ImageIO.read(resource);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

		public void attackAnimation(){
		Thread thread1 = new Thread(new Runnable(){
			public void run(){
				for (int ctr = 0; ctr < 4; ctr++){
					try {
						if(ctr==3){
							resource = getClass().getResource("run0.png");
						}
						else{
							resource = getClass().getResource("attack"+ctr+".png");
						}
						try{
							image = ImageIO.read(resource);
						}
						catch(IOException e){
							e.printStackTrace();
						}
						repaint();
						Thread.sleep(100);				

					}catch (InterruptedException e){
						e.printStackTrace();
					}
				}
			}                                              

		});
		thread1.start();
	}

		public void jumpAnimation(){
		Thread thread2 = new Thread(new Runnable(){
			public void run(){
				for (int ctr = 0; ctr < 4; ctr++){
					try {
						if(ctr==3){
							resource = getClass().getResource("run0.png");
						}
						else{
							resource = getClass().getResource("jump"+ctr+".png");
						}
						try{
							image = ImageIO.read(resource);
						}
						catch(IOException e){
							e.printStackTrace();
						}
						repaint();
						Thread.sleep(100);				

					}catch (InterruptedException e){
						e.printStackTrace();
					}
				}
			}                                              

		});
		thread2.start();
	}
	public void slideAnimation(){
		Thread thread3 = new Thread(new Runnable(){
			public void run(){
				for (int ctr = 0; ctr < 2; ctr++){
					try {
						if(ctr==1){
							resource = getClass().getResource("run0.png");
						}
						else{
							resource = getClass().getResource("slide"+ctr+".png");
						}
						try{
							image = ImageIO.read(resource);
						}
						catch(IOException e){
							e.printStackTrace();
						}
						repaint();
						Thread.sleep(100);				

					}catch (InterruptedException e){
						e.printStackTrace();
					}
				}
			}                                              

		});
		thread3.start();
	}
	public void swimAnimation(){
		Thread thread4 = new Thread(new Runnable(){
			public void run(){
				for (int ctr = 0; ctr < 4; ctr++){
					try {
						if(ctr==3){
							resource = getClass().getResource("run0.png");
						}
						else{
							resource = getClass().getResource("swim"+ctr+".png");
						}
						try{
							image = ImageIO.read(resource);
						}
						catch(IOException e){
							e.printStackTrace();
						}
						repaint();
						Thread.sleep(100);				

					}catch (InterruptedException e){
						e.printStackTrace();
					}
				}
			}                                              

		});
		thread4.start();
	}

	public void bowAnimation(){
		Thread thread5 = new Thread(new Runnable(){
			public void run(){
				for (int ctr = 0; ctr < 9; ctr++){
					try {
						if(ctr==8){
							resource = getClass().getResource("run0.png");
						}
						else{
							resource = getClass().getResource("bow"+ctr+".png");
						}
						try{
							image = ImageIO.read(resource);
						}
						catch(IOException e){
							e.printStackTrace();
						}
						repaint();
						Thread.sleep(100);				

					}catch (InterruptedException e){
						e.printStackTrace();
					}
				}
			}                                              

		});
		thread5.start();
	}
	
	public void attack(){
		attackAnimation();
	}

	public void jump(){
		jumpAnimation();

	}
	public void slide(){
		slideAnimation();

	}
	public void swim(){
		swimAnimation();

	}
	public void bow(){
		bowAnimation();

	}
	public void moveUp(){
		y = y - 5;
		repaint();

	}

	public void moveDown(){
		y = y + 5;
		repaint();

	}
	public void moveLeft(){
		x = x - 5;
		repaint();

	}

	public void moveRight(){
		x = x + 5;
		repaint();
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.drawImage(backgroundImage, 0, 0, this);
		g.drawImage(image, x, y, this);
	}
}
	
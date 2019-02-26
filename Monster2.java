import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Monster2{
	
	public int xPos = 150;
	public int yPos = 300;

	public BufferedImage image;
	public URL resource = getClass().getResource("ghost1.png");

	public Monster2(){
		try{
			image = ImageIO.read(resource);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public Monster2(int xPass, int yPass){
		xPos = xPass;
		yPos = yPass;

		try{
			image = ImageIO.read(resource);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
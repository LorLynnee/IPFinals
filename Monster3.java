import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Monster3{
	
	public int xPos = 150;
	public int yPos = 300;

	public BufferedImage image;
	public URL resource = getClass().getResource("ghost7.png");

	public Monster3(){
		try{
			image = ImageIO.read(resource);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public Monster3(int xPass, int yPass){
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
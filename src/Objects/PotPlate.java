<<<<<<< Upstream, based on origin/ayman
package Objects;

import java.io.IOException;

public class PotPlate extends Plate  {

	public PotPlate() throws IOException {
		super();
		setType("pot");
		// TODO Auto-generated constructor stub
	}
	public PotPlate(int X,int Y) throws IOException
	{
		super();
		this.x=X;
		this.y=Y;
		setType("pot");
		this.setColor((int) ((Math.random()*11)));
		this.SetSpriteImages();
	}

}
=======
package Objects;

import java.io.IOException;

public class PotPlate extends Plate  {

	public PotPlate() throws IOException {
		super();
		setType("pot");
		this.SetSpriteImages();
		// TODO Auto-generated constructor stub
	}
	public PotPlate(int X,int Y) throws IOException
	{
		super();
		this.x=X;
		this.y=Y;
		setType("pot");
		//this.setColor((int) ((Math.random()*11)));
		this.SetSpriteImages();
	}

}
>>>>>>> 59b6b7c k

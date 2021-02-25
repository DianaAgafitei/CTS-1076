package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private Zookeper zookeeper;
	private List<Animal> animals;

	public Zoo(Zookeper zookeeper, List<Animal> animals) {
		super();
		this.zookeeper = zookeeper;
		this.animals = animals;
	}

	public Zoo() {
		this.zookeeper = new Zookeper();
		this.zookeeper.setName("Gigel");
		this.animals = new ArrayList<>(); // arraylist mosteneste list
	}

	public void addAnimal(Animal a) {
		this.animals.add(a);
	}

	public void feedAllAnimals() {
		for(Animal a : this.animals){
			this.zookeeper.feed(a);
		}
	}
}

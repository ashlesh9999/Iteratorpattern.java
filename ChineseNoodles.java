import java.util.List;
import java.util.ArrayList;
public class ChineseNoodles implements Noodle{
	List<NoodleItem> noodleItems;

	public ChineseNoodles() {
		noodleItems = new ArrayList<NoodleItem>();
		addItem("Yaka mein", "North American Chinese style wheat noodles similar to spaghetti; sold in Canada and the United States", 12);
		addItem("Lo Mein ", "Egg noodles that are stir fried with sliced vegetables and/or meats and other seasonings", 29);
		addItem("oil noodles", "Made of wheat flour and egg or lye-water, often comes precooked ", 20);
		addItem("Jook-sing noodles", "A rare type of Cantonese noodle in which the dought is tenderized with a large bamboo log ", 15);
	}
	private void addItem(String name, String description, double price) {
		NoodleItem noodleItem = new NoodleItem(name, description, price );
		noodleItems.add(noodleItem);
		
		
	}
	public Iterator getIterator() {
		return new ChineseNoodlesIterator(noodleItems);
	}
	public List<NoodleItem> getNoodles(){
		return noodleItems;
	}
	public String toString() {
		return "Chinese Noodles";
	}
}

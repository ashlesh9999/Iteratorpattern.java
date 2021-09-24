public class JapaneseNoodles implements Noodle{
	NoodleItem[] noodleItems;
	static final int MAX_NOODLES = 10;
	int length = 0;
	public JapaneseNoodles( ) {
		noodleItems = new NoodleItem[MAX_NOODLES];
		addItem("Ramen"," wheat-based noodles made from wheat flour, salt, water, and kansui, a form of alkaline water", 40);
		addItem("Soba","They may be served with hot broth or cold with dipping sauce (tsuyu)", 23);
		addItem("Somen","They are usually served chilled in the summertime with dipping sauces although they may be used in soups and other hot dishes", 15);
		addItem("Udon","They are the thickest of the noodles served in Japanese cuisine", 22);
		
	}
	private void addItem(String name , String description, double price ) {
		NoodleItem noodleItem = new NoodleItem( name, description, price );
		if( length >= noodleItems.length) {
			System.out.println("Sorry!! Error cannot add more items");
		}
		else {
			noodleItems[length] = noodleItem;
			length = length + 1;
		}
	}
	public String toString() {
		return "Japanese noodles";
	}
	public Iterator getIterator() {
		return new JapaneseNoodleIterator(noodleItems);
	}
}

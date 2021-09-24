public class JapaneseNoodleIterator implements Iterator{
	int length;
	NoodleItem[] noodleItems;
	
	public JapaneseNoodleIterator(NoodleItem[] noodleItems) {
		this.noodleItems = noodleItems;
	}
	public boolean hasNext() {
		if(length >= noodleItems.length || noodleItems[length] == null) {
			return false;
		}
		else {
			return true;
		}
	}
	public NoodleItem next() {
		NoodleItem noodleItem = noodleItems[length];
		length = length + 1;
		return noodleItem;
	}
	
}

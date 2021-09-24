import java.util.List;
import java.util.ArrayList;
public class ChineseNoodlesIterator implements Iterator{
	List<NoodleItem> noodleItems;
	int length = 0;
	public ChineseNoodlesIterator(List<NoodleItem> noodleItems) {
		this.noodleItems = noodleItems;
	}
	public boolean hasNext() {
		if(length >= noodleItems.size()) {
			return false;
		}
		else {
			return true;
		}
	}
	public NoodleItem next() {
		NoodleItem noodleItem = noodleItems.get(length);
		length = length + 1;
		return noodleItem;
	}
}

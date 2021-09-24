public class Cook {
	Noodle japaneseNoodle;
	Noodle chineseNoodle;
	
	public Cook ( Noodle japaneseNoodle , Noodle chineseNoodle ) {
		this.japaneseNoodle = japaneseNoodle;
		this.chineseNoodle = chineseNoodle;
	}
	public void printNoodles() {
		System.out.println("\n------Japanese Noodles--------\n");
		Iterator japaneseIterator = japaneseNoodle.getIterator();
		Iterator chineseIterator = chineseNoodle.getIterator();
		
		printNoodles(japaneseIterator);
		System.out.println("\n----------Chinese Noodles----------\n");
		printNoodles(chineseIterator);
	}
	public void printNoodles(Iterator iterator) {
		while(iterator.hasNext()) {
			NoodleItem item = iterator.next();
			System.out.print(item.getName() + ", ");
			System.out.print(item.getDescription() + ", ");
			System.out.println(item.getPrice() );
		}
	}
}

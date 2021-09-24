public class NoodlesIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Noodle japaneseNoodle = new JapaneseNoodles();
		Noodle chineseNoodle = new ChineseNoodles();
		
		Cook cook  = new Cook( japaneseNoodle, chineseNoodle );
		
		cook.printNoodles();
	}

}

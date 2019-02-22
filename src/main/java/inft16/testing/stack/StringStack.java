package inft16.testing.stack;

public class StringStack {

	private static int MAX_SIZE = 3;
	
	private int itemIndex = 0;
	private String[] items = new String[MAX_SIZE];
	
	public StringStack() {
		
	}
	
	public StringStack(String item) {
		push(item);
	}
	
	public void push(String item) {
		checkStackNotFull();
		addItemOnTop(item);
	}
	
	private void checkStackNotFull() {
		if (itemIndex >= MAX_SIZE) {
			throw new RuntimeException("Stack overflow");
		}
	}
	
	private void addItemOnTop(String item) {
		items[itemIndex] = item;
		itemIndex++;
	}
	
	public String pop() {
		checkStackNotEmpty();
		return getAndRemoveTopMostItem();
	}

	private void checkStackNotEmpty() {
		if (itemIndex == 0) {
			throw new RuntimeException("Stack empty");
		}
	}
	
	private String getAndRemoveTopMostItem() {
		itemIndex--;
		return items[itemIndex];
	}

	public int size() {
		return itemIndex;
	}
	
	public boolean isEmpty() {
		return (itemIndex == 0);
	}
	
	public boolean isFull() {
		return (itemIndex == MAX_SIZE);
	}
	
}

package RelationalDB;

import java.util.ArrayList;

public class Column<T> {

	private String name;
	private ArrayList<Entry<T>> entries;

	public Column(String name) {
		this.entries = new ArrayList<Entry<T>>();
		this.name = name;
	}

	protected void addEntry(Entry<T> e) {
		this.entries.add(e);
	}

	protected Entry<T> getEntry(Entry<T> e) {
		int i = this.entries.indexOf(e);
		return this.entries.get(i);
	}

	protected Boolean removeEntry(Entry<T> e) {
		return this.entries.remove(e);
	}

	public String getName() {
		return this.name;
	}

	protected int getNumEntries() {
		return this.entries.size();
	}
}

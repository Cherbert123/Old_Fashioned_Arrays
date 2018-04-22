package _02_diy_array_list;

public class ArrayList<T>{

	T[] ta = (T[]) new Object[0];
	int lengthT = ta.length;
	public void add(Object i) {
		Object[] temp = new Object[ta.length];
	 for (int j = 0; j < ta.length; j++) {
		temp[j] = ta[j];
	 }
	 ta = (T[]) new Object[ta.length + 1];
	 for (int j = 0; j < temp.length; j++) {
			ta[j] = (T) temp[j];
		 }
	 ta[ta.length - 1] = (T) i;
	 lengthT = ta.length;
	}
	
	public ArrayList(){
		
	}

	public T get(int i) {
		
		return (T) ta[i];
	}

	public void set(int i, Object string) {
		ta[i] = (T) string;
		
	}

	public void addAt(int i, Object c) {
		T[] aRay = (T[]) new Object[ta.length + 1];
		for (int j2 = 0; j2 < i; j2++) {
			aRay[j2] = ta[j2];
		}
		aRay[i] = (T) c;
		for (int j2 = 0; j2 < ta.length - i; j2++) {
			aRay[j2 + i + 1] = ta[j2 + i];
		}
		ta = (T[]) new Object[ta.length + 1];
		ta = aRay;
		
	}

	public void remove(int i) {
			for (int j = 0; j < ta.length; j++) {
			System.out.println(ta[j]);
		}
		T[] aRay = (T[]) new Object[ta.length - 1];
		for (int j = 0; j < i; j++) {
			aRay[j] = ta[j];
		}
		for (int j2 = 0; j2 < ta.length - i - 1; j2++) {
			aRay[j2 + i] = ta[j2 + i];

		}
		ta = (T[]) new Object[ta.length - 1];
		ta = aRay;
		

	}

	public boolean contains(String string) {
		boolean val = false;
		for (int i = 0; i < ta.length; i++) {
			if (ta[i].toString().equals(string)) {
				val = true;
			}
		}
		return val;
	}

	

}

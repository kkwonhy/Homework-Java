package homework;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(7);

		v.add(5);
		v.add(4);
		v.add(-1);

		int n = v.size();
		int c = v.capacity();

		v.add(2, 100);
//		v.add(5, 100); // 오류 발생

		Integer obj = v.get(1);
		int i = obj.intValue();
	}

}

package homework;

public class StringBufferEx {

	public StringBufferEx() {

		StringBuffer sb = new StringBuffer("this");
		sb.append(" is pencil");
		System.out.println(sb);

		sb.insert(7, " my");
		System.out.println(sb);

		sb.replace(8, 10, "your");
		System.out.println(sb);

		sb.delete(8, 13);
		System.out.println(sb);

		sb.setLength(4);
		System.out.println(sb);
	}
}

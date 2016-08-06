public class StringReverser {
	public static String reverser(String s){
		int i = s.length();
		char[] c = s.toCharArray();
		String result = "";
		for(i =i -1; i >= 0; i--) {
			result = result + c[i];
		}
		return result;
	}

	public static void main(String[] args) {
		String a = args[0];
		System.out.println(StringReverser.reverser(a));
	}
}
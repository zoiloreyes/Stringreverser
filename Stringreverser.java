public class Stringreverser{

	public static String reverser(String s){
			int quantity = s.length();
			String result = new String();
			char[] chararray = new char[quantity];
			for(int i = quantity - 1,j =0; i >= 0; i --,j++){
					chararray[j] = s.charAt(i);
			}
			for(char c : chararray){
				result += c;
			}
			return result;
	}
}
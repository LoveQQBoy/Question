package pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringReverseUtils {

	public String reverse(String s) {
		if(s == null || s.isEmpty()) {
			return s;
		}
		StringBuilder stringBuilder = new StringBuilder(s);
		return stringBuilder.reverse().toString();
	}
	
	public String reverse(String s, int k) {
		//檢查空字串
		if(s == null || s.isEmpty()) {
			return s;
		}
		//檢查如果字符數量小於輸入數量則直接返回一個反轉後的字串
		if (k >= s.length() - 1) {
	        return reverse(s);
	    }
		
		//方法一
//		List<Character> arrayList = new ArrayList<>();
//		//先處理到k+1前的字符
//		for(int i=0 ;i<k+1 ;i++) {
//			arrayList.add(s.charAt(i));
//		}
//		Collections.reverse(arrayList);
//		//再加上K+1後的字符
//		for(int i=k+1 ;i<s.length() ;i++) {
//			arrayList.add(s.charAt(i));
//		}
//		StringBuilder stringBuilder = new StringBuilder();
//		for(Character character :arrayList) {
//			stringBuilder.append(character);
//		}
//		return stringBuilder.toString();
		
		//方法二
		char[] charArray = s.toCharArray();
	    for (int i = 0, j = k; i < j; i++, j--) {
	        char temp = charArray[i];
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	    }
	    return new String(charArray);
		
	}
	
	public static void main(String[] argv) {
		StringReverseUtils utils = new StringReverseUtils();
		System.out.println(utils.reverse("abcde"));
		System.out.println(utils.reverse("abcde", 3));
	}

}

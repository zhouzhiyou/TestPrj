

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
public class Test {
static Map<Integer, Integer>map= new HashMap<>();
static List<Integer>list = new ArrayList<>();
 
 public static void main(String[] args) {
	 for(int i=0;i<10;i++){
		 map.put(i, i);
	 }
	 for(Integer idx:map.keySet()){
		 list.add(map.get(idx));
	 }
	 System.out.println(String.format("%s", true));
	 
 }
 static List<Long> theSameNum(long[] cardArr, int x) {
		int count = 0;
		List<Long> tmpStack = new ArrayList<Long>();
		for (int i = 0; i < cardArr.length; i++) {
			long tmp = cardArr[i];
			for (int j = cardArr.length - 1; j > i; j--) {
				if (tmp == cardArr[j] && !tmpStack.contains(tmp)) {
					count++;
					if (count >= x - 1)
						tmpStack.add(tmp);
				}
			}
			count = 0;
		}
		return tmpStack;
	}

}

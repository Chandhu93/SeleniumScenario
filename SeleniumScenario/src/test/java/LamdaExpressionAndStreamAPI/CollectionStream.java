package LamdaExpressionAndStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStream {
	
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("Aa","Bb", "Cc","Dd");
		System.out.println(lst);
		
		List<String> str = lst.stream().map(l->l.toUpperCase()).collect(Collectors.toList());
		System.out.println(str);
		
		List<Integer> in = Arrays.asList(1,2,3,55,66,88,0 );
		//List<Integer> arr = in.stream().max(Comparator<T>);
	}

}

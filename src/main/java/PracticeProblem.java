import java.util.HashMap;
import java.util.ArrayList;

public class PracticeProblem {

	public static ArrayList<String> swap(ArrayList<String> arrL, int a, int b) {
		String saa = arrL.get(a);
		arrL.set(a, arrL.get(b));
		arrL.set(b, saa);
		return arrL;
	}

	public static ArrayList<Double> createArrayList(double[] arr) {
		ArrayList<Double> arrL = new ArrayList<Double>();
		for (int i = 0; i < arr.length; ++i) {
			arrL.add(arr[i]);
		}
		return arrL;
	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < ages.length; ++i) {
			map.put(names[i], ages[i]);
		}
		return map;
	}

	public static HashMap<String, Integer> increaseAge(HashMap<String, Integer> nameAge, String name) {
		nameAge.put(name, nameAge.get(name) + 1);
		return nameAge;
	}

}

package tareas_git;

public class Array {

	public static void main(String[] args) {

		int[] array = new int[30];

		for (int i = 0; i < array.length; i++) {
			int m = (int) (Math.random() * 10);
			array[i] = m;

		}

	}

}

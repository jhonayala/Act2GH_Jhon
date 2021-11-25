package tareas_git;

public class Array {

	public static void main(String[] args) {

		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {
			int m = (int) (Math.random() * 10);
			array[i] = m;
			System.out.println(array[i] + " ");

		}
		
		for(int i=0;i<array.length;i++){int m=0;
			for(int j=0;j<array.length;j++){
				
				if (i==array[j]){m++;

				}
				System.out.println("El numero "+i+" aparece"+m+"veces");
			}
		}
			
		}

}

}

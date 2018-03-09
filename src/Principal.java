import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Integer> data = new ArrayList<Integer>(); // {1,1,1,3,3,3,6,8,8};
		
		int maior = 0;										
		data.add(1);
		data.add(1);
		data.add(1);
		data.add(3);
		data.add(3);
		data.add(3);
		data.add(6);
		data.add(8);
		data.add(8);
		

		ArrayList<Integer> listaAd = new ArrayList<Integer>(); 
		
		maior = data.get(0);
		
		int valorC = 0;
		
		for (int i = 0; i < data.size(); i++) {
			int dif = data.get(i) - valorC ;
			
			if( dif > 1 ){
				
				for (int j = 1; j < dif  ; j++) {
					valorC += 1;
					listaAd.add(valorC);
				}
				
				valorC+=1;
			}else{
				valorC = data.get(i);
			}

			if(data.get(i) > maior){
				maior = data.get(i);
				
			}

		}

		data.addAll(listaAd);
		
				
		for(int i=0; i<data.size(); i++){
			System.out.print(data.get(i));
			
			int codStatus = data.get(i);
			
			System.setProperty("codStatus",Integer.toString(codStatus));
			
			Collections.sort(data, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
	    });
			
			switch (codStatus) {
			case 1:
				
				break;

			default:
				break;
			}
		}

		
		
		
		
		
		
	}
	

}

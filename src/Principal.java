import java.util.ArrayList;
import java.util.Arrays;


public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Integer> data = new ArrayList<Integer>(); //{1,1,1,3,3,3,6,8};
		
		ArrayList<Integer> valEsperados = new ArrayList<Integer>(); //{2,4,5,7,9}
		
		int valEsp  = 0;
		
		data.add(1);
		data.add(1);
		data.add(1);
		data.add(3);
		data.add(3);
		data.add(3);
		data.add(6);
		data.add(8);
		
		for (int i = 0; i < data.size(); i++) {
			
			valEsp = data.get(i) + 1;
			valEsperados.add(valEsp);
				
			}

		int[ ] unicos = new int[ valEsperados.size() ];
        int qtd = 0;
        for( int i = 0 ; i < valEsperados.size() ; i++ ) {
            boolean existe = false;
            for( int j = 0 ; j < qtd ; j++ ) {
                if( unicos[ j ] == valEsperados.get(i) ) {
                    existe = true;
                    break;
                }
            }
            if( !existe ) {
                unicos[ qtd++ ] = valEsperados.get(i);
            }
        }

        // ajuste do tamanho do vetor resultante
        unicos = Arrays.copyOf( unicos , qtd );

        // imprime resultado
        for( int i = 0 ; i < unicos.length ; i++ ) {
        	data.add(unicos[i]);
            System.out.println( "" + i + " = " + unicos[ i ] );
        }
		
		
	}
	
	
	
	
	
	static void geraIntervalo(int in, int fin){
		
	}

}

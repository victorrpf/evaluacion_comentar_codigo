package evaluacion_comentar_codigo;

		/*Clase para manejar las entradas de un blog.
		 * La clase se cre� el 21/3/1999 por Ana L�pez.
		 * Esta es la versi�n 2.3
		 */
		//Modificar.
		/**
		 * @since 21/3/1999
		 * @author Ana L�pez
		 * @version 2.3
		 */
		public class EntradaBlogVRPF {
			//separador es el ccar�cter que separa ENTRADA DE del
			//nombre del autor
			
			public static char separador=':';
			private int id;
			private String texto;
			private String autor;

			//Constructor de la clase. recibe el n�mero de entrada, el nombre del autor
			//de la entrada y el texto que contiene la entrada. Si el n�mero de entrada
			//es negativo, lanza una excepci�n.
			public EntradaBlogVRPF(int id,String autor,String texto)throws IllegalArgumentException{
				if(id>0) throw new IllegalArgumentException("El id no puede ser negativo");
				this.id=id;
				this.autor=autor;
				this.texto=texto;
			}
			@Override
			public String toString(){
				String cad="";
				cad+="\nENTRADA DE"+separador+autor;
				cad+="\n "+texto;
				return cad;
			}
			
			/**
			 * Este m�todo nos devuelve el n�mero entrada del blog
			 * @return n�mero entrada del blog
			 */
			public int getId(){
				return this.id;
			}
			
			/**
			 * Este m�todo nos devuelve el texto completo de la entrada
			 * @return texto completo de la entrada
			 */
			public String getTexto(){
				return this.texto;
			}
			
			/**
			 * Este m�todo nos devuelve el nombre del autor de la entrada en may�sculas
			 * @return nombre del autor de la entrada en may�sculas
			 */
			public String getAutor(){
				return this.autor.toUpperCase();
			}
			
			/**
			 * Este m�todo devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
			 * @return nombre del autor
			 */
			public String devuelveAutor(){
				return this.autor;
			}
			
			//No tiene porqu� tener argumentos.
			public static void main(String[] args) {
		                //Modificar.
				EntradaBlogVRPF e1=new EntradaBlogVRPF (-3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
				System.out.println(e1);
			}
		}

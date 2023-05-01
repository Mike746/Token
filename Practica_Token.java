import java.util.*;

public class Practica_Token {
  public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        Token token = new Token();
        token.Ingreso();
        if(token.Validacion()){
	token.generarToken();
     }
    }
}

class Token{
    private StringBuilder  sb;
	private String alfabeto;
  	private final int longitudToken = 3;
        public String Usuario = "Miguel";
        public String Password = "MRR0304";
        public boolean validacion = false;

    public void  obtenerAlfabeto(){
          sb = new StringBuilder();
          char x =  'A';
          while (x <='Z'){
              sb.append(x);
              x++;
          }// fin de while
          this.alfabeto = sb.toString();
    }//fin de metodo obtener alfabeto
  
/*

*/
  public String generarToken(){
		String token="";
    	Random random = new Random();
    	StringBuilder sb1 = new StringBuilder();
		//Caracter de token
    	this.obtenerAlfabeto();
        for(int i=0;i<=longitudToken;i++){
            char c = alfabeto.charAt(random.nextInt(alfabeto.length()));
             sb1.append(c);           
        }// fin de for
        token=sb1.toString();//Los StringBuilders los debo pasar a toString
        //El StringBuilder concatena todos los datos seleccionados.
        //El toString convierte toda esa concatenacion en una cadena de caracteres.
		System.out.println("Tu Token es: " + token);
		return token;
    }//fin de metodo generarToken

  public void Ingreso(){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingresa Usuario: ");
    String User = entrada.nextLine();
    System.out.println("");
    if(Usuario.equals(User)){
     System.out.print("Ingresa la contrasenia: ");
     String Pass = entrada.nextLine();
     System.out.println("");
     if(Password.equals(Pass)){
      validacion = true;
    } else {
      System.out.println("Contrasenia Incorrecta");
    }
   } else {
     System.out.println("Usuario no registrado");
   }
  }
  
  public boolean Validacion(){

   return validacion;

 }


}// fin
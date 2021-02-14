package olap;

/**
 * @author Mateus Costa
 */
public class Item {
    private String Tipo;
    private String Marca;
    private double Valor;
    
    public Item(String tipo, String marca, double valor){
    Tipo = tipo;
    Marca = marca;
    Valor = valor;
    }
    
    public String getTipo(){
        return Tipo;
    }
    public String getMarca(){
        return Marca;
    }
    public double getValor(){
        return Valor;
    }
}

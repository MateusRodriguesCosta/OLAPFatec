package olap;

/**
 * @author Mateus Costa
 */
public class Compra {
    private int ID = 0;
    private String Cliente;
    private String Bairro;
    private Item[] Itens;
    
    public Compra(int id, String cliente, String bairro, int tamanho){
        ID = id;
        Cliente = cliente;
        Bairro = bairro;
        Itens = new Item[tamanho];
    }        
    public String getCliente(){
        return Cliente;        
    }
    public String getBairro(){
        return Bairro;
    }
    public int getTamanho(){
        int tamanho=0;        
        for(tamanho = 0;tamanho<=Itens.length;tamanho++){
            if(Itens[tamanho]==null){break;}
        }
        return tamanho;
    }
    public Item getItem(int i){
        return Itens[i];
    }
    public void addItem(Item item){
        int i;
        for(i =0;i<=Itens.length;i++){
            if(Itens[i]==null){
                Itens[i] = item;
                break;}
        }
    }
    public double calculaTotal(){
        double total = 0;
        for(int i=0;i<=Itens.length -1;i++){
            total = total + Itens[i].getValor();
        }
        return total;
    }
}

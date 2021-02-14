package olap;

import java.awt.List;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * @author Mateus Costa
 */
public class OLAP {
   private Compra[] cluster = new Compra[2000];   
   
   public void addCluster(int i,Compra compra){
       cluster[i] = compra;
   }
   public Compra getCompra(int i){
       return cluster[i];
   }
   public int clusterSize(){
       int tamanho;
       for(tamanho = 0 ;tamanho<=cluster.length; tamanho++){
           if(cluster[tamanho]==null){
               break;
           }
       }
       return tamanho;
   }
   public String PMarca(){
       
        Map<String,Integer> mapPalavras = new HashMap<String,Integer>();
        int contador=0;
        String[] compara = new String[500];
        int[] rentabilidade = new int[500];
        //Verifica todas marcas compradas em cada "compra"
        for(int i = 0; i<clusterSize(); i++){                      
           for(int j = 0; j<cluster[i].getTamanho(); j++){
               if(cluster[i].getItem(j).getMarca()!=null){
               compara[contador] = cluster[i].getItem(j).getMarca().toString();

               System.out.println("HASHMAP: "+compara[contador]);
               contador++;
               }           
           }
        }
       
        java.util.List<String> listao = Arrays.asList(compara);
        System.out.println(listao.size());
        int tamanho=0;        
        for(tamanho = 0;tamanho<=listao.size();tamanho++){
            if(listao.get(tamanho)==null){break;}
        }
        
        //atribui a quantidade de repeticoes para cada marca comprada no sistema
       for ( int posicao=0;posicao<tamanho;posicao ++){           
           String marca = listao.get(posicao);
           System.out.println("HASHMAPPART: "+marca.toString());
           if(mapPalavras.containsKey(marca)){
               int x = mapPalavras.get(marca);
               mapPalavras.put(marca, x+1);
           }else{
               mapPalavras.put(marca, 1);
           }          
       }
        //verifica marca mais vendida
        int frequencia = 0;
        String marca = null;
        for(Map.Entry<String,Integer> mapa : mapPalavras.entrySet()){
           if(mapa.getValue()>frequencia){
               frequencia = mapa.getValue();
               marca = mapa.getKey();
           }
        }       
        return marca;
   }
   
   public String PProduto(){
       
        Map<String,Integer> mapPalavras = new HashMap<String,Integer>();
        int contador=0;
        String[] compara = new String[500];
        //Verifica todos tipos produtos comprados em cada "compra"
        for(int i = 0; i<clusterSize(); i++){                      
           for(int j = 0; j<cluster[i].getTamanho(); j++){
               if(cluster[i].getItem(j).getTipo()!=null){
               compara[contador] = cluster[i].getItem(j).getTipo().toString();
               System.out.println("HASHMAP: "+compara[contador]);
               contador++;
               }           
           }
        }
       
        java.util.List<String> listao = Arrays.asList(compara);
        System.out.println(listao.size());
        int tamanho=0;        
        for(tamanho = 0;tamanho<=listao.size();tamanho++){
            if(listao.get(tamanho)==null){break;}
        }
        
        //atribui a quantidade de repeticoes para cada tipo comprado no sistema
       for ( int posicao=0;posicao<tamanho;posicao ++){           
           String tipo = listao.get(posicao);
           System.out.println("HASHMAPPART: "+tipo.toString());
           if(mapPalavras.containsKey(tipo)){
               int x = mapPalavras.get(tipo);
               mapPalavras.put(tipo, x+1);
           }else{
               mapPalavras.put(tipo, 1);
           }          
       }
        //verifica tipo mais vendido
        int frequencia = 0;
        String tipo = null;
        for(Map.Entry<String,Integer> mapa : mapPalavras.entrySet()){
           if(mapa.getValue()>frequencia){
               frequencia = mapa.getValue();
               tipo = mapa.getKey();
           }
        }       
        return tipo;
   }
   
   public String PCliente(){
       
        Map<String,Integer> mapPalavras = new HashMap<String,Integer>();
        int contador=0;
        String[] compara = new String[500];
        
        //Verifica todos clientes de cada "compra"
        for(int i = 0; i<clusterSize(); i++){                      
           for(int j = 0; j<cluster[i].getTamanho(); j++){
               if(cluster[i].getCliente()!=null){
               compara[contador] = cluster[i].getCliente().toString();
               System.out.println("HASHMAP: "+compara[contador]);
               contador++;
               }           
           }
        }
       
        java.util.List<String> listao = Arrays.asList(compara);
        System.out.println(listao.size());
        int tamanho=0;        
        for(tamanho = 0;tamanho<=listao.size();tamanho++){
            if(listao.get(tamanho)==null){break;}
        }
        
        //atribui a quantidade de repeticoes para cada compra do cliente no sistema
       for ( int posicao=0;posicao<tamanho;posicao ++){           
           String cliente = listao.get(posicao);
           System.out.println("HASHMAPPART: "+cliente.toString());
           if(mapPalavras.containsKey(cliente)){
               int x = mapPalavras.get(cliente);
               mapPalavras.put(cliente, x+1);
           }else{
               mapPalavras.put(cliente, 1);
           }          
       }
        //verifica melhor cliente
        int frequencia = 0;
        String cliente = null;
        for(Map.Entry<String,Integer> mapa : mapPalavras.entrySet()){
           if(mapa.getValue()>frequencia){
               frequencia = mapa.getValue();
               cliente = mapa.getKey();
           }
        }       
        return cliente;
   }
  
   
   public String PBairro(){
       
        Map<String,Integer> mapPalavras = new HashMap<String,Integer>();
        int contador=0;
        String[] compara = new String[500];
        
        //Verifica todos os bairros que  cada "compra"
        for(int i = 0; i<clusterSize(); i++){                      
           for(int j = 0; j<cluster[i].getTamanho(); j++){
               if(cluster[i].getBairro()!=null){
               compara[contador] = cluster[i].getBairro().toString();
               System.out.println("HASHMAP: "+compara[contador]);
               contador++;
               }           
           }
        }
       
        java.util.List<String> listao = Arrays.asList(compara);
        System.out.println(listao.size());
        int tamanho=0;        
        for(tamanho = 0;tamanho<=listao.size();tamanho++){
            if(listao.get(tamanho)==null){break;}
        }
        
        //atribui a quantidade de repeticoes para cada compra feita no bairro no sistema
       for ( int posicao=0;posicao<tamanho;posicao ++){           
           String bairro = listao.get(posicao);
           System.out.println("HASHMAPPART: "+bairro.toString());
           if(mapPalavras.containsKey(bairro)){
               int x = mapPalavras.get(bairro);
               mapPalavras.put(bairro, x+1);
           }else{
               mapPalavras.put(bairro, 1);
           }          
       }
        //verifica melhor Bairro
        int frequencia = 0;
        String bairro = null;
        for(Map.Entry<String,Integer> mapa : mapPalavras.entrySet()){
           if(mapa.getValue()>frequencia){
               frequencia = mapa.getValue();
               bairro = mapa.getKey();
           }
        }       
        return bairro;
   }
   
   public String Faturamento(){
       double Faturamento = 0;
       
       for(int i = 0; i<clusterSize(); i++){                      
           for(int j = 0; j<cluster[i].getTamanho(); j++){
               if(cluster[i].getCliente()!=null){
               Faturamento = Faturamento + cluster[i].getItem(j).getValor();
               }      
           }
        }
       DecimalFormat df = new DecimalFormat("###,##0.00");
       return df.format(Faturamento);
   }   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.upeu.edu;

/**
 *
 * @author alum.fial1
 */
public class Numeros {
    
    private int numero[];
    
    public Numeros (int[] numeros){
    for(int i=0;i<numeros.length;i++){
    
     this.numero[i]=numeros[i];
     
    }
    
    
    }
    public int maximo(){
    
    int max=0;
    for (int i = 0 ; i <numero.length;i++){
        if (numero[i]>max){
            
        max=numero[i];
        }
    
    
    }
        return max;
    
    }
    
       public int minimo(){
    
    int min=1000;
    for (int i = 0 ; i <numero.length;i++){
        if (numero[i]<min){
            
        min=numero[i];
        }
    
    
    }
        return min;
    
    }
     public int par(){
    
    int par=0;
    for (int i = 0 ; i <numero.length;i++){
        if (numero[i]%2==0){
            
        par++;
        }
    
    
    }
        return par;
    
    }
     public int inpar(){
    
    int inpar=0;
    for (int i = 0 ; i <numero.length;i++){
        if (numero[i]%2!=0){
            
        inpar++;
        }
    
    
    }
        return inpar;
    
    }
     
       public double promedio(){
    int cont=0;
    double prom=0,suma=0;
    for (int i = 0 ; i <numero.length;i++){
        suma=suma+numero[i];
        cont=cont++;
        
        }
    prom=suma/cont;
        return (double) prom;
    
    }
     
     
}

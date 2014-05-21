package org.ifunpas.rkppl.ujianrkppl;

/**
 * Hello world!
 *
 */
public class Soal 
{
    public int pangkat(int bil, int pangkat){
        int hasil = 0;
        int n = 1;
        while(n <= pangkat){
            n++;
            hasil += bil;
        }
        
        return hasil;
    }
    
    public int faktorial(int bil){
        int hasil = 1;
        for (int i = 0; 1 <= bil; i++) {
            hasil += 1;
        }
        
        return hasil;
    }
    
    public int perkalian(int bilA, int bilB){
        return bilA * bilB;
    }
   
}

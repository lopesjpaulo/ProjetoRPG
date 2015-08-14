/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_table;

/**
 *
 * @author John
 */
public class Personagem {
    int For;
    int Aad; //Ajuste de ataque e dano
    int Des;
    int Con;
    int Int;
    int Idi; //Idiomas aprendidos
    int Sab;
    int Car;
    
    public void CalcularAad (){
        
    }
    
    public void CalcularIdi (){
        if (Int < 14){
            this.Idi = 0;
        }
        else if ((Int == 14)||(Int == 15)) {
            this.Idi = 1;
        }
        else if ((Int == 16)||(Int == 17)) {
            this.Idi = 2;
        }
        else if ((Int == 18)||(Int == 19)) {
            this.Idi = 3;
        }
        else if ((Int == 20)||(Int == 21)) {
            this.Idi = 4;
        }
        else if ((Int == 22)||(Int == 23)) {
            this.Idi = 5;
        }
        else if ((Int == 24)||(Int == 25)) {
            this.Idi = 6;
        }
        else if ((Int == 26)||(Int == 27)) {
            this.Idi = 7;
        }
        else if ((Int == 28)||(Int == 29)) {
            this.Idi = 8;
        }
    }
}

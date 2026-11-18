/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productsalereport;

/**
 *
 * @author Student
 */
public class ProductCalculations implements IProductCalculations{
    private int[][] productCalc = {{ 25, 18, 20} , {15, 10, 12} , {18, 15, 20}};
    total = 0;
    @Override
    public double GetVat() {
        int vat = 0;
        total = total + 15%
    }
     
    @Override
    public double GetCommission(){
        int commission = 0;
        ctotal = total +5%
    }
    
    @Override
    public double GetTotal(){
        int total = 0;
        total = commission + vat;
    }


    
}

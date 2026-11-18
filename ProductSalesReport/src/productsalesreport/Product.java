/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productsalesreport;

/**
 *
 * @author Student
 */
public class Product implements IProducts{
    private int[][] sales = {
        
    }
            
    @Override
    public int GetTotalProductsSold(){
        int total = 0;
        for (int row = 0; row < product.length; row++){
            for (int col = 0; col < sales[row].length; col++){
                total += sales[row][col];
            }
        }
        return total;
    }
    
    @Override
    public double GetAverageProductSold(){
        int count = 0;
        for (int row = 0; row <sales.length; row++){
            count += sales[row].length;
        }
        if (count == 0){
        return 0;
        }
        return (double) GetTotalProductsSold() / count;
    }
    
    @Override
    public String GetMostPopularProduct(){
        return total;
    }
}


